package dk.kea.dat19c.Library.java.repositories;

import dk.kea.dat19c.Library.java.models.MedieDTO;
import dk.kea.dat19c.Library.java.models.UdlaanDTO;
import dk.kea.dat19c.Library.java.util.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UdlaanRepositoryImpl implements IUdlaanRepository{
    private Connection conn; //database



    public UdlaanRepositoryImpl() {
        this.conn = DatabaseConnectionManager.getDatabaseConnection();
    }

    @Override
    public void create(UdlaanDTO udlaanDTO) {

    }

    @Override
    public UdlaanDTO read(int Id) {
        return null;
    }

    @Override
    public List<UdlaanDTO> readAll() {
        List<UdlaanDTO> allUdlaan = new ArrayList<UdlaanDTO>();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Udlaan");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                UdlaanDTO tempUdlaan = new UdlaanDTO();
                tempUdlaan.setCprNR(rs.getInt(1));
                tempUdlaan.setEmnetal(rs.getInt(2));
                tempUdlaan.setISBN(rs.getString(3));
                tempUdlaan.setUdlånsdato(rs.getDate(4));
                tempUdlaan.setAfleveringssato(rs.getDate(5));
                allUdlaan.add(tempUdlaan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allUdlaan;
    }

    @Override
    public void edit(UdlaanDTO udlaan) {

    }

    @Override
    public void delete(int Id) {

    }
}
