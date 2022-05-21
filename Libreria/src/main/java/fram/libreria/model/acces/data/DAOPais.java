/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fram.libreria.model.acces.data;

import fram.libreria.model.domain.data.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ASUS
 */
public interface DAOPais extends JpaRepository<Pais, Long>{
    
}
