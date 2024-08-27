package com.example.VacciNation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.VacciNation.ENUM.Vaccinebrand;
import com.example.VacciNation.Model.Dose;
import com.example.VacciNation.Service.DoseService;

@RequestMapping
@RestController
public class DoseController {

    @Autowired
    DoseService doseService;

    @PostMapping("/Vaccinate")
    public Dose addDose(@RequestParam("id") int patientId, @RequestParam("brand") Vaccinebrand vaccinebrand){
        return doseService.addDose(patientId,vaccinebrand);

    }

}
