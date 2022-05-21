/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.model.domain.data;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 * Class Libro
 * @author Collazos Escobar David, Andrés David Muñoz 
 *         dacoes@unicauca.edu.co, andresdmunoz@unicauca.edu.co
 */

@Entity
@Table(name = "libro")
@Data
public class Libro{
    
    /**
     * Atributos 
     */
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="lb_id")
    private Long id;
    
    @Column(length=50, name="lb_titulo")
    private String titulo;
    
    @Column(length=20, name="lb_ano")
    private String ano ;
    
    @OneToMany
    @JoinColumn(name="lb_id")
    private List<Ejemplar> ejemplares;
    
    @ManyToMany(mappedBy = "librosAutor")
    private List<Autor> authors;  
    
    @ManyToMany(mappedBy = "librosCateg")
    private List<Categoria> categorias;  
}
