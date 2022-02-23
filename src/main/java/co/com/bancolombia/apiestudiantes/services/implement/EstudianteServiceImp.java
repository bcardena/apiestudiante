package co.com.bancolombia.apiestudiantes.services.implement;

import co.com.bancolombia.apiestudiantes.DTO.EstudianteDTO;
import co.com.bancolombia.apiestudiantes.entities.Estudiante;
import co.com.bancolombia.apiestudiantes.repositories.EstudianteRepository;
import co.com.bancolombia.apiestudiantes.services.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EstudianteServiceImp implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    @Override
    public void crearEstudiante(EstudianteDTO estudianteDTO) {
            estudianteRepository.save(dtoToEntity(estudianteDTO));
        }

    private Estudiante dtoToEntity(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = new Estudiante();
        estudiante.setGrado(estudianteDTO.getGrado());
        estudiante.setNombre(estudianteDTO.getNombre());
        return estudiante;
    }

}


