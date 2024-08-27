package com.example.VacciNation.Model;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import com.example.VacciNation.ENUM.AppointmentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String appointmentId;

    @CreationTimestamp
    private Date dateofappointment;

    @Enumerated(value = EnumType.STRING)
    private AppointmentStatus appointmentstatus;
    
    @ManyToOne
    @JoinColumn
    Doctor doctor;
    
    @OneToOne
    @JoinColumn
    Patient patient;

}
