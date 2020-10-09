package dk.kea.dat19c.Library.java.controllers;

import dk.kea.dat19c.Library.java.repositories.BoegerRepositoryImpl;
import dk.kea.dat19c.Library.java.repositories.IBoegerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BoegerController {

    private IBoegerRepository iboegerrepository;


    @Autowired
    public BoegerController() {
        iboegerrepository = new BoegerRepositoryImpl();

    }

    @GetMapping("/findbog")
    public String searchBoeger(){
        return "findbog";
    }

}

