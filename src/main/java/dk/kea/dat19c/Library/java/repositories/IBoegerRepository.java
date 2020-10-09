package dk.kea.dat19c.Library.java.repositories;

import java.util.List;

public interface IBoegerRepository<T>  {

    // CRUD operations
    public boolean create(T t);

    public T read(int id);

    public List<T> readAll();

    public void edit(T t);

    public void delete(int id);



}
