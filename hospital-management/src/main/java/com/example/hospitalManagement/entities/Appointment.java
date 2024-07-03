package com.example.hospitalManagement.entities;


import com.example.hospitalManagement.entities.enums.AppointmentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "citas")
public class Appointment extends Base {

    @Column(name = "hora_cita")
    private LocalDateTime appointmentTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private AppointmentStatus status;

    @Column(name = "observaciones")
    private String notes;

    //RELACIONES?
    /*@Column(name = "paciente")
    private Patient patient;
    @Column(name = "doctor")
    private Doctor doctor;*/


}
