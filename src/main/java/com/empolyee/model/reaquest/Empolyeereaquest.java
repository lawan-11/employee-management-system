package com.empolyee.model.reaquest;

import com.empolyee.model.enums.Jobtype;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Empolyeereaquest {

    @NotNull(message = "name is required")
    @NotBlank(message = "name can't be blank")
    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    private String name;

    @NotNull(message = "email is required")
    @NotBlank(message = "email can't be blank")
    @Size(min = 3, max = 20, message = "Email must be between 3 and 20 characters")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "designation is required")
    @NotBlank(message = "designation can't be blank")
    @Size(min = 3, max = 20, message = "Designation must be between 3 and 20 characters")
    private String designation;

    @NotNull(message = "Job type is required")
    private Jobtype jobtype;


    public Empolyeereaquest() {
    }


    public Empolyeereaquest(String name, String email, String designation, Jobtype jobtype) {
        this.name = name;
        this.email = email;
        this.designation = designation;
        this.jobtype = jobtype;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Jobtype getJobtype() {
        return jobtype;
    }

    public void setJobtype(Jobtype jobtype) {
        this.jobtype = jobtype;
    }


}