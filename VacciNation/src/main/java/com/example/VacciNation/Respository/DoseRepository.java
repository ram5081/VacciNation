package com.example.VacciNation.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.VacciNation.Model.Dose;

public interface DoseRepository extends JpaRepository<Dose,Integer> {

}
