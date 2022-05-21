/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fram.libreria.model.service.data;

import fram.libreria.model.domain.data.Autor;
import java.util.List;

/**
 * interface IAutorService
 *
 * @author Collazos Escobar David, Andrés David Muñoz dacoes@unicauca.edu.co,
 * andresdmunoz@unicauca.edu.co
 */
public interface IAutorService {

    /**
     * Permite buscar un autor por su id
     *
     * @param autor
     * @return Autor
     */
    public Autor findById(Autor autor);

    /**
     * Permite guardar un nuevo objeto Autor
     *
     * @param autor
     */
    public void save(Autor autor);

    /**
     * Borra un autor por mapeo
     *
     * @param autor
     */
    public void delete(Autor autor);

    /**
     * Retorna una lista de autores
     *
     * @return List Autor
     */
    public List<Autor> list();
}
