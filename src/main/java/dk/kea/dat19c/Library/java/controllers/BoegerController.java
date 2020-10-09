package dk.kea.dat19c.Library.java.controllers;

import dk.kea.dat19c.Library.java.models.BoegerDTO;
import dk.kea.dat19c.Library.java.repositories.BoegerRepositoryImpl;
import dk.kea.dat19c.Library.java.repositories.IBoegerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BoegerController {

    private IBoegerRepository iboegerrepository;


    @Autowired
    public BoegerController() {
        iboegerrepository = new BoegerRepositoryImpl();

    }

    /*------------------------------------- Find bog ---------------------------------------------*/

    @GetMapping("/findbog")
    public String findBog(Model model) {
        // if(model.getAttribute("customer") == null) {
        model.addAttribute("bog", new BoegerDTO());// laver et tomt customer object -> det der står i form {customer}
        //  }
        return "findBog";
    }


    @PostMapping("/getBogByTitel")
    public String getCustomerById(@ModelAttribute BoegerDTO boegerDTO, Model model) {
        BoegerDTO bogtest = iboegerrepository.read(boegerDTO.getTitel());
        model.addAttribute("bog", bogtest);
        return "findbog";

    }
        /*------------------------------------- Slet bog ---------------------------------------------*/

        @GetMapping("/sletbog")
        public String deleteBog(Model model, @RequestParam String titel){
            BoegerDTO bog = iboegerrepository.read(titel);
            model.addAttribute("boeger", bog);
            return "sletbog";
        }



        @PostMapping("/sletbog")
        public String deleteForGood(@RequestParam String titel){
            iboegerrepository.delete(titel);
            return "redirect:/index";
        }
}

