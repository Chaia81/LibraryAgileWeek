package dk.kea.dat19c.Library.java.repositories;

import dk.kea.dat19c.Library.java.models.BoegerDTO;
import dk.kea.dat19c.Library.java.util.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BoegerRepositoryImpl implements IBoegerRepository {

    private Connection conn; //database?
    private static final String DELETE_BOOKS_SQL = "DELETE FROM boeger WHERE titel =?";



    public BoegerRepositoryImpl() {
        this.conn = DatabaseConnectionManager.getDatabaseConnection();

    }

    @Override
    public void create(BoegerDTO boegerDTO) {

    }



    @Override

    public BoegerDTO read(String titel) {
        BoegerDTO b = new BoegerDTO(); //normalt ville man sætte denne til null i tilfælde af den ikke fnder noget i databasen fordi så returnere metoden null
        try {
            PreparedStatement getBooks = conn.prepareStatement("SELECT * FROM boeger WHERE titel=?");
            getBooks.setString(1, titel);
            ResultSet rs = getBooks.executeQuery();
            while (rs.next()) {
                b = new BoegerDTO();
                b.setTitel(rs.getString("titel")); //her settes en variabel med det data der er modtaget fra databasen
                b.setForfatter(rs.getString(2));
                b.setUdgivelsesaar(rs.getInt(3));
                b.setISBN(rs.getString(4));
                b.setUdlaansstatus(rs.getBoolean(5));
            }
        } catch (SQLException s) {
            s.printStackTrace();
        }
        return b; //returnere et obejct af typen customerDTO som er et DTO
    }



    @Override
    public List<BoegerDTO> readAll() {
        return null;
    }

    @Override
    public void edit(BoegerDTO boeger) {

    }

    @Override
    public void delete(String titel) {
        try {
            PreparedStatement prep = conn.prepareStatement(DELETE_BOOKS_SQL);
            prep.setString(1, titel);
            prep.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
