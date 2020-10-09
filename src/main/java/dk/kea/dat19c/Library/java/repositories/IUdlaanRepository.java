package dk.kea.dat19c.Library.java.repositories;


import dk.kea.dat19c.Library.java.models.UdlaanDTO;

import java.util.List;

public interface IUdlaanRepository {

    // CRUD operations
    public void create(UdlaanDTO udlaanDTO);

    public UdlaanDTO read(int Id);

    public List<UdlaanDTO> readAll();

    public void edit(UdlaanDTO udlaan);

    public void delete(int Id);



}

