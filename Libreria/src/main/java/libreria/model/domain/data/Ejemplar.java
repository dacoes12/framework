/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.model.domain.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 * Class Ejemplar
 * @author Collazos Escobar David, Andrés David Muñoz 
 *         dacoes@unicauca.edu.co, andresdmunoz@unicauca.edu.co
 */

@Entity
@Table(name = "Ejemplar")
@Data
public class Ejemplar {
    /**
     * Atributos 
     */
    
    @Id
    @Column(length=50,name="ej_icbn")
    private String icbn;
    
    @Column(length=20,name="ej_ano")
    private String ano="";
    
    @Column(length=50,name="ej_cantidad")
    private Long cantidad;
    
    @ManyToOne
    @JoinColumn(name="LB_ID", nullable=false)
    private Libro libro;  
    
}
