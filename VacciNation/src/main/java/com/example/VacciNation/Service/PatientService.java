package com.example.VacciNation.Service;
import java.util.Optional;
//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.VacciNation.Model.Patient;
import com.example.VacciNation.Respository.PatientRepository;

import Exception.PatientNotFoundException;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public void addPatient(Patient patient){
        patientRepository.save(patient);
    }


    public Optional<Patient> getPatient(int id){
        Optional<Patient> patientOptional =patientRepository.findById(id);


        if(patientOptional.isEmpty()){
            throw new PatientNotFoundException("Invalid patient id");
        }

      

        Patient patient = patientOptional.get();
        return Optional.ofNullable(patient);

}
}