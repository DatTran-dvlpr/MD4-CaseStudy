package com.example.md4casestudy.model.DTO;

import com.example.md4casestudy.model.Nationality;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;


public class CoachForm{
    private Long id;
    private String name;
    private String DoB;
    private Nationality nationality;
    private double base_salary;
    private MultipartFile cv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        this.base_salary = base_salary;
    }

    public MultipartFile getCv() {
        return cv;
    }

    public void setCv(MultipartFile cv) {
        this.cv = cv;
    }

    public CoachForm(String name, String doB, Nationality nationality, double base_salary, MultipartFile cv) {
        this.name = name;
        DoB = doB;
        this.nationality = nationality;
        this.base_salary = base_salary;
        this.cv = cv;
    }

    public CoachForm() {
    }

    public CoachForm(Long id, String name, String doB, Nationality nationality, double base_salary, MultipartFile cv) {
        this.id = id;
        this.name = name;
        DoB = doB;
        this.nationality = nationality;
        this.base_salary = base_salary;
        this.cv = cv;
    }
}
