/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fram.libreria.service.data;

import fram.libreria.acces.data.DAOPais;
import fram.libreria.domain.data.Pais;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */

@Service
public class PaisService implements IPaisService{
    
    @Autowired
    private DAOPais repo;  
    
    @Override
    @Transactional(readOnly=true)
    public Pais find(Pais pais) {
        return repo.findById(pais.getIdPais()).orElse(null);  
    }

    @Override
    @Transactional(readOnly=true)
    public List<Pais> listar() {
        return repo.findAll();  
    }

    @Override
    @Transactional
    public void delete(Pais pais) {
        repo.delete(pais);
    }

    @Override
    @Transactional
    public void save(Pais pais) {
        repo.save(pais); 
    }
    
    
}
