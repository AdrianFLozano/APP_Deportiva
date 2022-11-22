package com.academia.karate.entity;


import javax.persistence.*;




@Entity
@Table (name="Estudiantes")
public class estudiantes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name="nombre",nullable = false,length = 50)
    private String nombre;

    @Column (name="apellido",nullable = false,length = 50)
    private String apellido;

    
    @Column (name="correo",nullable = false,length = 50, unique = true)
    private String correo;

    @Column (name="edad",nullable = false,length = 50)
    private int edad;
    
    @Column (name="contrasena")
    private String contrasena;

  public estudiantes(){

  }

    public estudiantes(Long id, String nombre,String apellido, String correo, int edad, String contrasena) {
      this.id = id;
        this.nombre = nombre;
        this.nombre = apellido;
        this.correo = correo;
        this.edad = edad;
        this.contrasena = contrasena;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}


