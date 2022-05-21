/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fram.libreria.Controller;  

import fram.libreria.model.domain.data.Autor;
import fram.libreria.model.service.data.AutorService;
import fram.libreria.model.service.data.PaisService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

/**
 *
 * @author ASUS
 */

@Controller
@RequestMapping("/autores")
@Slf4j
public class AutorController {
    @Autowired 
    private AutorService autorService;  
    
    @Autowired
    private PaisService paisService;  
    
    @GetMapping("")
    public String inicio(Model model){
        log.info("Ejecutando desde AutorController ");
        var autores = autorService.list();  
        model.addAttribute("autores", autores);  
        return "index";  
    }   
    
    @GetMapping("/agregar")
    public String agregar(Autor autor, Model model){
        var lista = paisService.listar(); 
        model.addAttribute("paises", lista); 
        return "modificar";  
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Autor autor, Errors errores, Model model){
        if(errores.hasErrors()){
            return "modificar";
        }
        autorService.save(autor);
        return "redirect:/autores"; 
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Autor autor){
        autorService.delete(autor);
        return "redirect:/autores"; 
    }
    
    @GetMapping("/editar/{id}")
    public String editar(Autor autor, Model model){
        autor = autorService.findById(autor); 
        model.addAttribute("autor", autor);
        
        var lista = paisService.listar(); 
        model.addAttribute("paises", lista); 
        return "modificar";  
    }
}
