package com.academia.karate.Repository;


import com.academia.karate.entity.estudiantes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<estudiantes,Long> {

 

  


}
