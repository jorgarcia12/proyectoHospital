package com.example.hospitalManagement.entities;


import com.example.hospitalManagement.entities.enums.Specialization;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "doctor")
public class Doctor extends Base {

    @Column(name = "nombre")
    private String firstName;

    @Column(name = "apellido")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "especialidad")
    private Specialization specialization;

    @Column(name = "telefono")
    private String phone;

    @Column(name = "email")
    private String email;

    //RELACIONES

    /*appointments
    department
    */
}
