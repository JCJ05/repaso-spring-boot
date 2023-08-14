package com.spring.mvc.springwebmvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.springwebmvc.model.Usuario;

@Controller
@RequestMapping(path = "/app")
public class IndexController {
    
    @RequestMapping(path = {"", "/", "/index"} , method = RequestMethod.GET)
    public String index(Model model ,ModelMap modelMap , Map<String , Object> map , ModelAndView modelAndView) {

        model.addAttribute("mensaje", "Hola Spring MVC 5!");
        modelMap.addAttribute("mensaje2", "Hola Spring MVC 5! con ModelMap");
        map.put("mensaje3", "Hola Spring MVC 5! con Map");
        modelAndView.addObject("mensaje4", "Hola Spring MVC 5! con ModelAndView");

        return "index";
    }

    @RequestMapping(path = "/perfil")
    public String perfil(Model model) {
        
        Usuario usuario = new Usuario();
        usuario.setNombre("John");
        usuario.setApellido("Doe");

        model.addAttribute("usuario", usuario);
        
        return "perfil";
    }

    @RequestMapping(path = "/listar")
    public String listar(Model model) {
        
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("John", "Doe", "jhon@gmail.com"));
        usuarios.add(new Usuario("Jane", "Doe", "jane@gmail.com"));
        usuarios.add(new Usuario("Max", "Doe", "max@gmail.com"));

        model.addAttribute("titulo", "Listado de usuarios");
        model.addAttribute("usuarios", usuarios);

        return "listar";
    }
}
