package dk.kea.dat19c.Library.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class boegerController {


    @GetMapping("/")
    public String boeger(){
        return "boeger";
    }



}
