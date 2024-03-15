package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model ui) {
        String msg = "Olá controller!!!";
        ui.addAttribute ("message", msg); 
        return "/index.jsp";
    }
}
