package dk.kea.dat19c.Library.java.models;

import java.util.Date;

public class MedieDTO {
    private String titel;
    private String kunster;
    private Date udgivelseår;
    private int emnetal;
    private String medietype;
    private boolean udlånsstatus;

    public MedieDTO(String titel, String kunster, Date udgivelseår, int emnetal, String medietype, boolean udlånsstatus) {
        this.titel = titel;
        this.kunster = kunster;
        this.udgivelseår = udgivelseår;
        this.emnetal = emnetal;
        this.medietype = medietype;
        this.udlånsstatus = udlånsstatus;
    }

    public MedieDTO() {

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

    public String getMedietype() {
        return medietype;
    }

    public void setMedietype(String type) {
        this.medietype = type;
    }

    public boolean isUdlånsstatus() {
        return udlånsstatus;
    }

    public void setUdlånsstatus(boolean udlånsstatus) {
        this.udlånsstatus = udlånsstatus;
    }
}

