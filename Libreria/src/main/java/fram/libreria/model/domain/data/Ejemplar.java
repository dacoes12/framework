/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fram.libreria.model.domain.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author David Escobar
 */

@Entity
@Table(name = "Ejemplar")
@Data
public class Ejemplar {
    
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
