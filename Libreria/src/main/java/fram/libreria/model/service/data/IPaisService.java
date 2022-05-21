/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fram.libreria.model.service.data;

import fram.libreria.model.domain.data.Pais;
import java.util.List;


/**
 *
 * @author ASUS
 */

public interface IPaisService {
    public Pais find(Pais pais);  
    public List<Pais> listar();  
    public void delete(Pais pais);
    public void save(Pais pais); 
}
