package com.academia.karate.Servicio;

import com.academia.karate.Repository.EstudianteRepositorio;
import com.academia.karate.entity.estudiantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicioImpl implements EstudianteServicio{

    @Autowired
    private EstudianteRepositorio repositorio;

      
    @Override
    public void Eliminar( Long id){
        repositorio.deleteById(id);
    }
    @Autowired
  
    
    @Override
    public List<estudiantes> ListarTodosLosEstudiantes() {
        return repositorio.findAll();
    }
    @Override
    public estudiantes guardar(estudiantes estudiante){

        return repositorio.save(estudiante);
    }
  

}
