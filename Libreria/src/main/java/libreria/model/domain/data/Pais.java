/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.model.domain.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 * Class Pais
 * @author Collazos Escobar David, Andrés David Muñoz 
 *         dacoes@unicauca.edu.co, andresdmunoz@unicauca.edu.co
 */

@Entity
@Table(name = "Pais")
@Data
public class Pais implements Serializable{
    private static final long serialVersionUID = 1L; 
    
    /**
     * Atributos
     */
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPais")
    private Long idPais; 
    
    @Column(name="nombre")
    private String nombre;  
    
    @OneToMany(mappedBy="autor_pais")
    private List<Autor> autores_pais;

}
