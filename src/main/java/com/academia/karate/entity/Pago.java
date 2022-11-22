package com.academia.karate.entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "Pago")

public class Pago {

    @Id
    private String nombre;

    private String correo;
    private float valor;
    private Date fecha;
}
