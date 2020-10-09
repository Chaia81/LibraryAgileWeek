package dk.kea.dat19c.Library.java.repositories;

import dk.kea.dat19c.Library.java.models.MedieDTO;
import dk.kea.dat19c.Library.java.util.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedieRepositoryImpl implements IMedieRepository{
    private Connection conn; //database



    public MedieRepositoryImpl() {
        this.conn = DatabaseConnectionManager.getDatabaseConnection();
    }

    @Override
    public void create(MedieDTO medieDTO) {

    }

    @Override
    public MedieDTO read(int Id) {
        return null;
    }

    @Override
    public List<MedieDTO> readAll() {
        List<MedieDTO> allMedier = new ArrayList<MedieDTO>();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Medier");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MedieDTO tempMedie = new MedieDTO();
                tempMedie.setTitel(rs.getString(1));
                tempMedie.setKunster(rs.getString(2));
                tempMedie.setUdgivelseår(rs.getDate(3));
                tempMedie.setEmnetal(rs.getInt(4));
                tempMedie.setMedietype(rs.getString(5));
                tempMedie.setUdlånsstatus(rs.getBoolean(6));
                allMedier.add(tempMedie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allMedier;
    }

    @Override
    public void edit(MedieDTO medier) {

    }

    @Override
    public void delete(int Id) {

    }


}
