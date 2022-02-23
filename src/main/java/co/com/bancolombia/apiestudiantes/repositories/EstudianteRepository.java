package co.com.bancolombia.apiestudiantes.repositories;

import co.com.bancolombia.apiestudiantes.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {

}
