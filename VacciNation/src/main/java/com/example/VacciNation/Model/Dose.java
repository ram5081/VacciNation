package com.example.VacciNation.Model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import com.example.VacciNation.ENUM.Vaccinebrand;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Dose{
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Vaccinebrand vaccinebrand;

    private String serialno;

    

    @CreationTimestamp
    private Date dateofVaccination;

    @OneToOne // to create cardinality relationship 
    @JoinColumn // to create foreign key
    Patient patient;


}