package dk.kea.dat19c.Library.java.controllers;

import dk.kea.dat19c.Library.java.repositories.IUdlaanRepository;
import dk.kea.dat19c.Library.java.repositories.UdlaanRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class UdlaanController {
    private IUdlaanRepository iUdlaanRepository;


    @Autowired
    public UdlaanController() {
        iUdlaanRepository = new UdlaanRepositoryImpl();



    }
}
