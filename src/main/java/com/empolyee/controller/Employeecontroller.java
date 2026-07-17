package com.empolyee.controller;

import com.empolyee.model.entity.EmpolyeeBE;
import com.empolyee.model.reaquest.Empolyeereaquest;
import com.empolyee.service.IEmpolyeeservice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")

public class Employeecontroller {
    @Autowired
    private IEmpolyeeservice iEmpolyeeservice;
@GetMapping("/hello")
    public ResponseEntity<?> welcome(){
    return new ResponseEntity<>("hello to emp system", HttpStatus.OK);
}
@GetMapping
    public ResponseEntity<List<EmpolyeeBE>> getAllEmployee() {


    return new ResponseEntity<>(iEmpolyeeservice.getAllEmployee(), HttpStatus.OK);
}
@GetMapping("/{id}")
    public ResponseEntity<EmpolyeeBE> getEmployeebyid(@PathVariable  String id){
    return new ResponseEntity<>(iEmpolyeeservice.getEmployeebyId(id), HttpStatus.OK);
}

@PostMapping()
    public ResponseEntity<EmpolyeeBE> addEmployee(@Valid @RequestBody Empolyeereaquest empolyeereaquest){
    return new ResponseEntity<>(iEmpolyeeservice.addEmployee(empolyeereaquest),HttpStatus.CREATED);
}
@PutMapping("/{id}")
    public ResponseEntity<EmpolyeeBE> updateEmployee(@PathVariable String id,@Valid @RequestBody Empolyeereaquest empolyeereaquest){
    return new ResponseEntity<>(iEmpolyeeservice.UpdateEmployee(id,empolyeereaquest),HttpStatus.OK);
}
@DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable String id) {
    iEmpolyeeservice.deleteEmployee(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}

}
