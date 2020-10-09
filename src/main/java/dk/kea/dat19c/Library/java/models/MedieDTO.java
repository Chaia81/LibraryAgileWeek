package dk.kea.dat19c.Library.java.models;

import java.util.Date;

public class MedieDTO {
    private String titel;
    private String kunster;
    private Date udgivelseår;
    private int emnetal;
    private String type;
    private boolean status;

    public MedieDTO(String titel, String kunster, Date udgivelseår, int emnetal, String type, boolean status) {
        this.titel = titel;
        this.kunster = kunster;
        this.udgivelseår = udgivelseår;
        this.emnetal = emnetal;
        this.type = type;
        this.status = status;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getKunster() {
        return kunster;
    }

    public void setKunster(String kunster) {
        this.kunster = kunster;
    }

    public Date getUdgivelseår() {
        return udgivelseår;
    }

    public void setUdgivelseår(Date udgivelseår) {
        this.udgivelseår = udgivelseår;
    }

    public int getEmnetal() {
        return emnetal;
    }

    public void setEmnetal(int emnetal) {
        this.emnetal = emnetal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

