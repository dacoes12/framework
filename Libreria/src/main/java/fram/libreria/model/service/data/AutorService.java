package fram.libreria.model.service.data;

import fram.libreria.model.domain.data.Autor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import fram.libreria.model.acces.data.DAOAutor;

/**
 * class AutorService - establece una clase de tipo service para gestionar las
 * interacciones con interface DAOAutor (CRUD)
 *
 * @author Collazos Escobar David, Andrés David Muñoz dacoes@unicauca.edu.co,
 * andresdmunoz@unicauca.edu.co
 */
@Service
public class AutorService implements IAutorService {

    /**
     * Inyección de dependencias
     */
    @Autowired
    private DAOAutor repo;

    /**
     * Permite buscar un autor por su id
     *
     * @param autor
     * @return Autor
     */
    @Override
    @Transactional(readOnly = true)
    public Autor findById(Autor autor) {
        return repo.findById(autor.getId()).orElse(null);
    }

    /**
     * Permite guardar un nuevo objeto Autor
     *
     * @param autor
     */
    @Override
    @Transactional
    public void save(Autor autor) {
        repo.save(autor);
    }

    /**
     * Borra un autor por mapeo
     *
     * @param autor
     */
    @Override
    @Transactional
    public void delete(Autor autor) {
        repo.delete(autor);
    }

    /**
     * Retorna una lista de autores
     *
     * @return List Autor
     */
    @Override
    @Transactional(readOnly = true)
    public List<Autor> list() {
        return repo.findAll();
    }

}
