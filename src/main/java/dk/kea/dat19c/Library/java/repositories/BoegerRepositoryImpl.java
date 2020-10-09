package dk.kea.dat19c.Library.java.repositories;

import dk.kea.dat19c.Library.java.models.BoegerDTO;
import dk.kea.dat19c.Library.java.util.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoegerRepositoryImpl implements IBoegerRepository {
    private Connection conn; //database



    public BoegerRepositoryImpl() {
        this.conn = DatabaseConnectionManager.getDatabaseConnection();
    }

    @Override
    public void create(BoegerDTO boegerDTO) {

    }

    @Override
    public BoegerDTO read(int Id) {
        return null;
    }

    @Override
    public List<BoegerDTO> readAll() {
            List<BoegerDTO> allBooks = new ArrayList<BoegerDTO>();
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM Boeger");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    BoegerDTO tempBoeger = new BoegerDTO();
                    tempBoeger.setForfatter(rs.getString(1));
                    tempBoeger.setUdgivelsesaar(rs.getInt(2));
                    tempBoeger.setISBN(rs.getInt(3));
                    tempBoeger.setUdlaansstatus(rs.getBoolean(5));
                    allBooks.add(tempBoeger);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return allBooks;
    }

    @Override
    public void edit(BoegerDTO boeger) {

    }

    @Override
    public void delete(int Id) {

    }
}
