package dk.kea.dat19c.Library.java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class boegerController {

    @Autowired


    @GetMapping("/findbog")
    public String searchBoeger(){
        return "findbog";
    }



}
