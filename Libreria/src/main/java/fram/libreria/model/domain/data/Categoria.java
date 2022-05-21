/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fram.libreria.model.domain.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 * Class Categoria 
 * @author Collazos Escobar David, Andrés David Muñoz 
 *         dacoes@unicauca.edu.co, andresdmunoz@unicauca.edu.co
 */

@Entity
@Data
@Table(name="Categoria")
public class Categoria implements Serializable {
    
    /**
     *  Atributos  
     */
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cat_id")
    private Long id;
    
    @Column(length = 50,name="cat_nombre")
    private String nombre ;
    
    @ManyToMany
    @JoinTable(
            name = "librocategoria", 
            joinColumns = @JoinColumn(name = "CAT_ID"), 
            inverseJoinColumns = @JoinColumn(name = "LB_ID")
    )
    private List<Libro> librosCateg;  
    
}
