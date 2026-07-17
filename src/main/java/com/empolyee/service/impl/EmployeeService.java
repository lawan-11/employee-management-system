package com.empolyee.service.impl;

import com.empolyee.exception.Employeecustomexception;
import com.empolyee.model.entity.EmpolyeeBE;
import com.empolyee.model.reaquest.Empolyeereaquest;
import com.empolyee.repository.IEmpolyeerepository;
import com.empolyee.service.IEmpolyeeservice;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.swing.undo.CannotUndoException;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmpolyeeservice {
     @Autowired
     private ModelMapper modelMapper;
     @Autowired
     private IEmpolyeerepository iEmpolyeerepository;
    @Override
    public EmpolyeeBE addEmployee(Empolyeereaquest empolyeereaquest) {
        if(Employeealreadyexists(empolyeereaquest.getEmail())){
            throw new Employeecustomexception("employee already exists", HttpStatus.CONFLICT);
        }
        EmpolyeeBE empolyeeBE = modelMapper.map(empolyeereaquest, EmpolyeeBE.class);
        return iEmpolyeerepository.save(empolyeeBE);
    }

    @Override
    public List<EmpolyeeBE> getAllEmployee() {
        return iEmpolyeerepository.findAll();
    }

    @Override
    public EmpolyeeBE getEmployeebyId(String id) {
        Optional<EmpolyeeBE> employeeBE = iEmpolyeerepository.findById(id);
        if(employeeBE.isEmpty()){
            throw new Employeecustomexception("employee not found",HttpStatus.NOT_FOUND);
        }
        return employeeBE.get();
    }

    @Override
    public EmpolyeeBE UpdateEmployee(String id, Empolyeereaquest empolyeereaquest) {
        if(!Employeealreadyexists(empolyeereaquest.getEmail())){
            throw new Employeecustomexception("employee doesnt exist",HttpStatus.NOT_FOUND);
        }
        EmpolyeeBE empolyeeBE = modelMapper.map(empolyeereaquest, EmpolyeeBE.class);
        empolyeeBE.setId(id);

        return iEmpolyeerepository.save(empolyeeBE);
    }

    @Override
    public void deleteEmployee(String id) {
         iEmpolyeerepository.deleteById(id);


    }
    public  boolean Employeealreadyexists(String email){
    return iEmpolyeerepository.existsByEmail(email);

    }
}
