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
    private static final String DELETE_BOOK_SQL = "DELETE FROM Boeger WHERE id =?";



    public BoegerRepositoryImpl() {
        this.conn = DatabaseConnectionManager.getDatabaseConnection();
    }

    @Override
    public void create(BoegerDTO boegerDTO) {

    }

    @Override
    public BoegerDTO read(String titel) {
        BoegerDTO customerToReturn = new BoegerDTO(); //normalt ville man sætte denne til null i tilfælde af den ikke fnder noget i databasen fordi så returnere metoden null
        try {
            PreparedStatement getSingleCustomer = conn.prepareStatement("SELECT * FROM boeger WHERE titel=?");
            getSingleCustomer.setString(1, titel);
            ResultSet rs = getSingleCustomer.executeQuery();
            while (rs.next()) {
                customerToReturn = new BoegerDTO();
                customerToReturn.setTitel(rs.getString("titel")); //her settes en variabel med det data der er modtaget fra databasen
                customerToReturn.setForfatter(rs.getString(2));
                customerToReturn.setUdgivelsesaar(rs.getInt(3));
                customerToReturn.setISBN(rs.getInt(4));
                customerToReturn.setUdlaansstatus(rs.getBoolean(5));
            }
        } catch (SQLException s) {
            s.printStackTrace();
        }
        return customerToReturn; //returnere et obejct af typen customerDTO som er et DTO
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
    public void delete(String titel) {
        try {
            PreparedStatement prep = conn.prepareStatement(DELETE_BOOK_SQL);
            prep.setString(1, titel);
            prep.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
