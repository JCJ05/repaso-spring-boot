package com.spring.mvc.springwebmvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    
    @RequestMapping(path = {"", "/", "/index"} , method = RequestMethod.GET)
    public String index(Model model ,ModelMap modelMap , Map<String , Object> map , ModelAndView modelAndView) {

        model.addAttribute("mensaje", "Hola Spring MVC 5!");
        modelMap.addAttribute("mensaje2", "Hola Spring MVC 5! con ModelMap");
        map.put("mensaje3", "Hola Spring MVC 5! con Map");
        modelAndView.addObject("mensaje4", "Hola Spring MVC 5! con ModelAndView");

        return "index";
    }
}
