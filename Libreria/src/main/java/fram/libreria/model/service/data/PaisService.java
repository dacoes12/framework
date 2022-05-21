/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fram.libreria.model.service.data;

import fram.libreria.model.acces.data.DAOPais;
import fram.libreria.model.domain.data.Pais;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * class PaisService - establece una clase de tipo service para gestionar las
 * interacciones con interface DAOPais (CRUD)
 *
 * @author Collazos Escobar David, Andrés David Muñoz dacoes@unicauca.edu.co,
 * andresdmunoz@unicauca.edu.co
 */
@Service
public class PaisService implements IPaisService {

    /**
     * Inyección de dependencias
     */
    @Autowired
    private DAOPais repo;

    /**
     * Permite buscar un pais por su id
     *
     * @param pais
     * @return Pais
     */
    @Override
    @Transactional(readOnly = true)
    public Pais find(Pais pais) {
        return repo.findById(pais.getIdPais()).orElse(null);
    }

    /**
     * Retorna una lista de autores
     *
     * @return List Pais
     */
    @Override
    @Transactional(readOnly = true)
    public List<Pais> listar() {
        return repo.findAll();
    }

    /**
     * Borra un Pais - por mapeo
     *
     * @param autor
     */
    @Override
    @Transactional
    public void delete(Pais pais) {
        repo.delete(pais);
    }

    /**
     * Permite guardar un nuevo objeto Autor
     *
     * @param pais
     */
    @Override
    @Transactional
    public void save(Pais pais) {
        repo.save(pais);
    }

}
