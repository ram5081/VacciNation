package com.example.VacciNation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.VacciNation.Model.Doctor;
import com.example.VacciNation.Respository.DoctorRepository;

@Service
public class DoctorService {
    
    @Autowired
    DoctorRepository doctorRepository;

    @PostMapping("/ADD")
    public String addDoctor(Doctor doctor) {
       
       doctorRepository.save(doctor);
       return "Doctor saved successfully";
    }


    public String deleteDoctor(int id){
        doctorRepository.deleteById(id);
        return "Doctor has been deleted";
    }

}
