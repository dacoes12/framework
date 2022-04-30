/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fram.libreria.domain.data;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author David Escobar
 */

@Entity
@Table(name = "Ejemplar")
public class Ejemplar {
    
    @Id
    @Column(length=50,name="ej_icbn")
    private String icb;
    
    @Column(length=20,name="ej_ano")
    private String ano="";
    
    @Column(length=50,name="ej_cantidad")
    private Long cantidad;
    
    @OneToOne
    @JoinColumn(name="id")
    private List<Libro> libros;
    
        
}
