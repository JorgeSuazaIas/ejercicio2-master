
package com.ejemplo.ejercicio.entity;

import com.ejemplo.ejercicio.dto.ProfesorDTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
    @Id
    private int id;
    @Column(name = "maestro")
    private  String maestro;
    @Column
    private int horario;
    @Column(name = "tema")
    private String tema;


}

