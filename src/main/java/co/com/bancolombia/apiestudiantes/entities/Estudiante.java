package co.com.bancolombia.apiestudiantes.entities;

//import org.springframework.data.annotation.Id;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String grado;

}
