

package fram.libreria.service.data;

import fram.libreria.domain.data.Autor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import fram.libreria.acces.data.DAOAutor;

/**
 *
 * @author ASUS
 */
@Service
public class AutorService implements IAutorService {
    
    @Autowired
    private DAOAutor repo;  

    @Override
    @Transactional(readOnly=true)
    public Autor findById(Autor autor) {
        return repo.findById(autor.getId()).orElse(null);  
    }

    @Override
    @Transactional
    public void save(Autor autor) {
        repo.save(autor); 
    }

    @Override
    @Transactional
    public void delete(Autor autor) {
        repo.delete(autor);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Autor> list() {
        return repo.findAll();  
    }
    
    
}
