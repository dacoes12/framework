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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author David Escobar
 */
@Entity
@Table(name = "Autor")
@Data
public class Autor implements Serializable {
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="aut_id")
    private Long id;
    
    @Column(length=50,name="aut_nombre")
    private String nombre;
    
    @Column(length=50,name="AUT_APELLIDO")
    private String apellido ;
    
    @ManyToOne
    @JoinColumn(name="aut_pais", nullable=false)
    private Pais autor_pais;  
    
    @ManyToMany
    @JoinTable(
            name = "autorlibro", 
            joinColumns = @JoinColumn(name = "AUT_ID"), 
            inverseJoinColumns = @JoinColumn(name = "LB_ID")
    )
    private List<Libro> librosAutor;  

}
