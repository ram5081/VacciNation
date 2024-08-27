package com.example.VacciNation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.VacciNation.Model.Doctor;
import com.example.VacciNation.Service.DoctorService;

@RequestMapping
@RestController

public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor){
        return doctorService.addDoctor(doctor);
    } 
    
    @DeleteMapping("/Delete")
    public String deleteDoctor(@RequestParam("id") int id){
        return doctorService.deleteDoctor(id);
    }

}
