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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "departamento")
public class Department extends Base{

    @Column(name = "nombre_departamento")
    private String name;

    @Column(name = "descripcion")
    private String description;



    /*RELACIONES
    DOCTOR
    PATIENT
    */
}
