package cis.project.module1;

import cis.project.module1.Models.ConRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MainController {

    @Autowired
    ConRepo conRepo;

    @RequestMapping("/")
    public ModelAndView doHome() {
        ModelAndView mdv = new ModelAndView("index");

        mdv.addObject("conventionlist", conRepo.findAll());


        return mdv;
    }

}
