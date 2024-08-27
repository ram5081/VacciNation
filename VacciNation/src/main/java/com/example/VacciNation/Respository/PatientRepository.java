package com.example.VacciNation.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.VacciNation.Model.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

}
