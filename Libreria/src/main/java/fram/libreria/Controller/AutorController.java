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
 * class AutorController - gestiona las diferentes vistas asociadas 
 * a el manejo de autores. 
 * 
 * Se mapea por /autores
 *
 * @author ASUS
 */
@Controller
@RequestMapping("/autores")
@Slf4j
public class AutorController {

    /**
     * Inyeccion de dependencias 
     * Atributos de tipo AutorService, PaisService
     */
    @Autowired
    private AutorService autorService;

    @Autowired
    private PaisService paisService;

    /**
     * Mapea el viínculo principal asociado.  
     * @param model - contendrá los valores a mostrar en la vista.  
     * @return vista index
     */
    @GetMapping("")
    public String inicio(Model model) {
        log.info("Ejecutando desde AutorController ");
        var autores = autorService.list();
        model.addAttribute("autores", autores);
        return "index";
    }

    /**
     * Gestiona los atributos necesarios, para poder 
     * ingresar un nuevo autor.
     * 
     * Mapea  /agregar 
     * @param autor
     * @param model - contendrá los valores a mostrar en la vista.  
     * @return vista modificar
     */
    @GetMapping("/agregar")
    public String agregar(Autor autor, Model model) {
        
        var lista = paisService.listar();
        model.addAttribute("paises", lista);
        return "modificar";
    }

    /**
     * Mapea las solicitud /guardar
     * Verifica que los datos del autor estén completos 
     * Si existen errores, los retorna y los despliega en la vista 
     * 
     * @param autor - nuevo elemento a guardar
     * @param errores - lista de errores 
     * @param model - contendrá los valores a mostrar en la vista.  
     * @return /vista modificar si existen errores, vista principal si no. 
     */
    @PostMapping("/guardar")
    public String guardar(@Valid Autor autor, Errors errores, Model model) {
        if (errores.hasErrors()) {
            return "modificar";
        }
        autorService.save(autor);
        return "redirect:/autores";
    }

    /**
     * Mapea la solicitud /eliminar 
     * 
     * @param autor - autor que será eliminado 
     * @return vista principal de gestión de autores
     */
    @GetMapping("/eliminar")
    public String eliminar(Autor autor) {
        autorService.delete(autor);
        return "redirect:/autores";
    }

    /**
     * Mapeado por /editar/{id}
     * 
     * Permite gestionar los elementos necesarios para la edición 
     * de los datos de un elemento Autor
     * 
     * @param autor - autor que será editado 
     * @param model - elementos que se mostrarán en la vista 
     * requerida 
     * 
     * @return vista modificar 
     */
    @GetMapping("/editar/{id}")
    public String editar(Autor autor, Model model) {
        autor = autorService.findById(autor);
        model.addAttribute("autor", autor);

        var lista = paisService.listar();
        model.addAttribute("paises", lista);
        
        return "modificar";
    }
}
