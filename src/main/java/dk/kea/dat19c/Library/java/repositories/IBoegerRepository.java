package dk.kea.dat19c.Library.java.repositories;

import dk.kea.dat19c.Library.java.models.BoegerDTO;

import java.util.List;

public interface IBoegerRepository{

    // CRUD operations
    public void create(BoegerDTO boegerDTO);

    public BoegerDTO read(String titel);

    public List<BoegerDTO> readAll();

    public void edit(BoegerDTO boeger);

    public void delete(int Id);



}
