package dk.kea.dat19c.Library.java.models;

import java.util.Date;

public class UdlaanDTO {
    private int cprNR;
    private int emnetal;
    private int ISBN;
    private Date udlånsdato;
    private Date afleveringssato;

    public UdlaanDTO(int cprNR, int emnetal, int ISBN, Date udlånsdato, Date afleveringssato) {
        this.cprNR = cprNR;
        this.emnetal = emnetal;
        this.ISBN = ISBN;
        this.udlånsdato = udlånsdato;
        this.afleveringssato = afleveringssato;
    }

    public UdlaanDTO() {

    }

    public int getCprNR() {
        return cprNR;
    }

    public void setCprNR(int cprNR) {
        this.cprNR = cprNR;
    }

    public int getEmnetal() {
        return emnetal;
    }

    public void setEmnetal(int emnetal) {
        this.emnetal = emnetal;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public Date getUdlånsdato() {
        return udlånsdato;
    }

    public void setUdlånsdato(Date udlånsdato) {
        this.udlånsdato = udlånsdato;
    }

    public Date getAfleveringssato() {
        return afleveringssato;
    }

    public void setAfleveringssato(Date afleveringssato) {
        this.afleveringssato = afleveringssato;
    }
}
