package dk.kea.dat19c.Library.java.repositories;

import dk.kea.dat19c.Library.java.models.BoegerDTO;
import dk.kea.dat19c.Library.java.models.MedieDTO;

import java.util.List;

public interface IMedieRepository{

    // CRUD operations
    public void create(MedieDTO medieDTO);

    public MedieDTO read(int Id);

    public List<MedieDTO> readAll();

    public void edit(MedieDTO medier);

    public void delete(int Id);



}
