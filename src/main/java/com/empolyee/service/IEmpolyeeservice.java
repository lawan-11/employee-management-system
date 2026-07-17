package com.empolyee.service;

import com.empolyee.model.entity.EmpolyeeBE;
import com.empolyee.model.reaquest.Empolyeereaquest;

import java.util.List;

public interface IEmpolyeeservice {
    EmpolyeeBE addEmployee(Empolyeereaquest empolyeereaquest);

    List<EmpolyeeBE> getAllEmployee();

    EmpolyeeBE getEmployeebyId(String id);
   // page<EmpolyeeBE> getPageEmployee();
    EmpolyeeBE UpdateEmployee(String id, Empolyeereaquest empolyeereaquest);

    void deleteEmployee(String id);
}
