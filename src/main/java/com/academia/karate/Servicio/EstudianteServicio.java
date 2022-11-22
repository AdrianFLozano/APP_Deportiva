package com.academia.karate.Servicio;

import com.academia.karate.entity.estudiantes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public interface EstudianteServicio {




    public List<estudiantes> ListarTodosLosEstudiantes();
    public estudiantes guardar(estudiantes estudiante);

    public void Eliminar(Long id);
}
