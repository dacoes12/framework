/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fram.libreria.model.acces.data;

import fram.libreria.model.domain.data.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ASUS
 */
public interface DAOCategoria extends JpaRepository<Categoria, Long>{
    
    
}
