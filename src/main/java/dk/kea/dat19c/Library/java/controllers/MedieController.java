package dk.kea.dat19c.Library.java.controllers;

import dk.kea.dat19c.Library.java.repositories.IMedieRepository;
import dk.kea.dat19c.Library.java.repositories.MedieRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class MedieController {
    private IMedieRepository iMedieRepository;


    @Autowired
    public MedieController() {
        iMedieRepository = new MedieRepositoryImpl();



    }
}
