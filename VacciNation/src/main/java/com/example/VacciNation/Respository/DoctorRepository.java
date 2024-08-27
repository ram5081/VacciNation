package com.example.VacciNation.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.VacciNation.Model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
