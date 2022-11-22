/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.karate.controllers;

/**
 *
 * @author HP
 */
import com.academia.karate.Servicio.EstudianteServicio;
import com.academia.karate.entity.estudiantes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.management.modelmbean.ModelMBeanAttributeInfo;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class estudianteController {

    @Autowired
    private EstudianteServicio servicio;

    @GetMapping({"/cobra", "/"})
    public String ListarEstudiantes(Model modelo) {
//    modelo.addAttribute("estudiantes",servicio.ListarTodosLosEstudiantes());
        return "index";
    }

    @GetMapping("/cobra/registro")
    public String crearEstudianteFormulario(Model modelo) {
        estudiantes estudiante = new estudiantes();
        modelo.addAttribute("estudiante", estudiante);
        return "superegistro";

    }

    @PostMapping({"/cobra/guardar"})
    public String guardar(@ModelAttribute("estudiante") estudiantes estudiante) {
        servicio.guardar(estudiante);
        System.out.println("contraseña" + estudiante.getContrasena());
        return "login";

    }

    @GetMapping({"/cobra/login"})
    public String Log(Model modelo) {

        return "login";
    }
    @PostMapping({"/cobra/login"})
    public String Login(Model modelo) {

        return "login";
    }

    @PostMapping({"/cobra2"})
    public String Listar(@ModelAttribute("estudiante") estudiantes estudiante,Model modelo) {
        modelo.addAttribute("estudiantes", servicio.ListarTodosLosEstudiantes());
//   int ola=0;
//   modelo.addAttribute("edad", ola);
  List<estudiantes> estudiantes = servicio.ListarTodosLosEstudiantes();
        for (estudiantes estudiante1 : estudiantes) {
            if (estudiante.getCorreo().equals(estudiante1.getCorreo()) && estudiante.getContrasena().equals(estudiante1.getContrasena())) { 
               modelo.addAttribute("idusuario",estudiante1.getId());
                return "dentro";
            }
        }
        return "login";
    }

    @GetMapping({"/cobra/{id}"})
    public String Eliminar(@PathVariable String id) {
        servicio.Eliminar(Long.parseLong(id));
        return "index";
    }
}
