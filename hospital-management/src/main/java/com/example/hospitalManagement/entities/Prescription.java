package com.example.hospitalManagement.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "prescripcion")
public class Prescription extends Base {

    @Column(name = "medicacion")
    private String medication;

    @Column(name = "dosis")
    private String dosage;

    @Column(name = "frecuencia")
    private String frequency;

    @Column(name = "duracion")
    private String duration;

    //RELACIONES
    //@Column(name = "historial_medico")
    //private MedicalRecord medicalRecord;

}
