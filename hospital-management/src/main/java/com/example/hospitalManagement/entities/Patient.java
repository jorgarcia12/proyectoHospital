package com.example.hospitalManagement.entities;


import com.example.hospitalManagement.entities.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "paciente")
public class Patient extends Base {

    @Column(name = "nombre")
    private String firstName;

    @Column(name = "apellido")
    private String lastName;

    @Column(name = "fecha_nacimiento")
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero")
    private Gender gender;

    @Column(name = "telefono")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "direccion")
    private String address;



    //one to many?
    //private List<MedicalRecord> medicalRecords;
    //private List appointments = new ArrayList<>();
}
