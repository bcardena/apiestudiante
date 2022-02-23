package co.com.bancolombia.apiestudiantes.controllers;



import co.com.bancolombia.apiestudiantes.DTO.EstudianteDTO;
import co.com.bancolombia.apiestudiantes.services.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

@RequiredArgsConstructor
@RestController
@RequestMapping(value ="estudiante")
public class EstudianteController {

    private final EstudianteService estudianteService;

    @PostMapping()
    public ResponseEntity<EstudianteDTO> crearEtudiante(@RequestBody EstudianteDTO estudianteDTO) throws URISyntaxException {
        URI uri = new URI("/estudiante");
        estudianteService.crearEstudiante(estudianteDTO);
        return ResponseEntity.created(uri).body(estudianteDTO);
        //return ResponseEntity.status(HttpStatus.CREATED).body("Creado corretamente");
    }

    @GetMapping("/prueba")
    public String prueba(){
        return "Prueba exitosa";
    }
}
