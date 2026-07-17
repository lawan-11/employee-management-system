package com.empolyee.model.entity;

import com.empolyee.model.enums.Jobtype;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class EmpolyeeBE {

    @Id
    @NotNull
    private String id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String designation;
    @NotNull
    private Jobtype jobtype;

    public EmpolyeeBE() {
    }

    public EmpolyeeBE(String id, String name, String email, String designation, Jobtype jobtype) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.designation = designation;
        this.jobtype = jobtype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "EmpolyeeBE{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                ", jobtype=" + jobtype +
                '}';
    }
}