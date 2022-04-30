/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fram.libreria.domain.data;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author David Escobar
 */
@Entity
@Table(name = "Libro")
public class Libro{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="lb_id")
    private Long id;
    
    
    @Column(length=50, name="lb_titulo")
    private String titulo;
    
    @Column(length=20, name="lb_ano")
    private String ano ;
   
    @OneToMany
    @JoinColumn(name="id")
    private List<Libro> libros;
    
}
