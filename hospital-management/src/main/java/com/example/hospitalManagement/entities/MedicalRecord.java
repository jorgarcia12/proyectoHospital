package com.example.hospitalManagement.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "historial_medico")
public class MedicalRecord extends Base {

    @Column(name = "fecha")
    private LocalDate recordDate;

    @Column(name = "diagnostico")
    private String diagnosis;

    @Column(name = "tratamiento")
    private String treatment;

    @Column(name = "observaciones")
    private String notes;

    //RELACIONES

    // patient
    // doctor
}
