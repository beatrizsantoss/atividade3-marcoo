package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalcController {
        @RequestMapping(/calc)
        public String form() {
            return "calc/form";
    }
}
