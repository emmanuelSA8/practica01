package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data // Lombok genera automáticamente los getters y setters
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")
    private Long idArbol;  

    private String nombre;
    private String especie;
    private int altura;
    private int edad;
    private int diametro;
    private String dureza;
}
