package dk.kea.dat19c.Library.java.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class BoegerController {

    @GetMapping("/findbog")
    public String searchBoeger(){
        return "findbog";
    }

}

