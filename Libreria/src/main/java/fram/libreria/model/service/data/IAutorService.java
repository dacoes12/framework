/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fram.libreria.model.service.data;

import fram.libreria.model.domain.data.Autor;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IAutorService {
    public Autor findById(Autor autor);  
    public void save(Autor autor);
    public void delete(Autor autor);
    public List<Autor> list();  
}
