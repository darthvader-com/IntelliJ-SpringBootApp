package pw.superfantastic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pw.superfantastic.service.MainService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
public class MainControllerImpl implements MainController {

    @Resource(name = "mainService")
    private MainService mainService;

    @Override
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        List<HashMap<String, Object>> list = mainService.selectTboard();
        mv.setViewName("/views/index");
        mv.addObject("list", list);
        return mv;
    }

}

