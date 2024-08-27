package com.example.VacciNation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.VacciNation.Model.Patient;
import com.example.VacciNation.Service.PatientService;

@RestController
@RequestMapping

public class PatientController {

    @Autowired
    PatientService patientService;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @PostMapping("/add")
    public ResponseEntity addPatient(@RequestBody Patient patient){
        try{
        patientService.addPatient(patient);
        return new ResponseEntity("Patient Added successfully" , HttpStatus.CREATED );
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage() , HttpStatus.NOT_ACCEPTABLE);
        }

    }

    @GetMapping("/get")
    public Patient getPatient(@RequestParam("id") int id){

        return (Patient) patientService.getPatient(id);
    }


}
