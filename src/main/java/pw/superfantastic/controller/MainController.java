package pw.superfantastic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public interface MainController {
    @GetMapping("/")
    ModelAndView index();
}
