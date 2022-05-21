/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fram.libreria.model.acces.data;

import fram.libreria.model.domain.data.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * interface DAOPais - mapea un Crud básico para la tabla Pais 
 * @author Collazos Escobar David, Andrés David Muñoz 
 *         dacoes@unicauca.edu.co, andresdmunoz@unicauca.edu.co
 */
public interface DAOPais extends JpaRepository<Pais, Long>{
    
}
