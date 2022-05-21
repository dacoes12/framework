/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.model.service.data;

import libreria.model.domain.data.Pais;
import java.util.List;

/**
 * interface IPaisService
 *
 * @author Collazos Escobar David, Andrés David Muñoz dacoes@unicauca.edu.co,
 * andresdmunoz@unicauca.edu.co
 */
public interface IPaisService {

    /**
     * Permite buscar un pais por su id
     *
     * @param pais
     * @return Pais
     */
    public Pais find(Pais pais);

    /**
     * Retorna una lista de autores
     *
     * @return List Pais
     */
    public List<Pais> listar();

    /**
     * Borra un autor por mapeo
     *
     * @param autor
     */
    public void delete(Pais pais);

    /**
     * Retorna una lista de autores
     *
     * @return List Autor
     */
    public void save(Pais pais);
}
