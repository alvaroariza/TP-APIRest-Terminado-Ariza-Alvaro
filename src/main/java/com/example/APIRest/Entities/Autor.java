package com.example.APIRest.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Autor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Autor extends Base {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "biografia", length = 1500)
    private String biografia;

}