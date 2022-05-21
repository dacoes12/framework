/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package libreria.model.acces.data;

import libreria.model.domain.data.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * interface DAOAutor - mapea un Crud básico para la tabla autor 
 * @author Collazos Escobar David, Andrés David Muñoz 
 *         dacoes@unicauca.edu.co, andresdmunoz@unicauca.edu.co
 */
public interface DAOAutor extends JpaRepository<Autor, Long>{
    
}
