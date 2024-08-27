package com.example.VacciNation.Service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.VacciNation.ENUM.Vaccinebrand;
import com.example.VacciNation.Model.Dose;
import com.example.VacciNation.Model.Patient;
import com.example.VacciNation.Respository.DoseRepository;
import com.example.VacciNation.Respository.PatientRepository;

import Exception.PatientNotFoundException;

@Service
public class DoseService {

    @Autowired
    DoseRepository doseRepository;

    @Autowired
    PatientRepository patientRepository;

    
    public Dose addDose(int patientId,Vaccinebrand vaccinebrand){
        Optional<Patient> patientOptional = patientRepository.findById(patientId);

        if(patientOptional.isEmpty()){
            throw new PatientNotFoundException("Invalid patient id");
        }

        Patient patient=patientOptional.get();

        if(patient.isVaccinated()){
            throw new RuntimeException("Patient is already vaccinated");
        }

        patient.setVaccinated(true);
        
        Dose dose = new Dose(); // creating dose object if he has not taken dose
        dose.setVaccinebrand(vaccinebrand);
        dose.setSerialno(String.valueOf(UUID.randomUUID()));
        dose.setPatient(patient); // setting the foreign key

        patientRepository.save(patient);
        
        return doseRepository.save(dose);

        


    }

}
