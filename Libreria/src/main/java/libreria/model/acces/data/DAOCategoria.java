/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package libreria.model.acces.data;

import libreria.model.domain.data.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * interface DAOCategoria - mapea un Crud básico para la tabla categoria 
 * @author Collazos Escobar David, Andrés David Muñoz 
 *         dacoes@unicauca.edu.co, andresdmunoz@unicauca.edu.co
 */
public interface DAOCategoria extends JpaRepository<Categoria, Long>{
    
}
