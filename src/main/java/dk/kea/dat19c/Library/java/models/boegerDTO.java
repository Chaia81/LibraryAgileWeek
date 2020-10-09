package dk.kea.dat19c.Library.java.models;

public class boegerDTO {
    private String titel;
    private String forfatter;
    private int udgivelsesaar;
    private int ISBN;
    private boolean udlaansstatus;

    public boegerDTO(String titel, String forfatter, int udgivelsesaar, int ISBN, boolean udlaansstatus) {
        this.titel = titel;
        this.forfatter = forfatter;
        this.udgivelsesaar = udgivelsesaar;
        this.ISBN = ISBN;
        this.udlaansstatus = udlaansstatus;

    }



    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public int getUdgivelsesaar() {
        return udgivelsesaar;
    }

    public void setUdgivelsesaar(int udgivelsesaar) {
        this.udgivelsesaar = udgivelsesaar;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isUdlaansstatus() {
        return udlaansstatus;
    }

    public void setUdlaansstatus(boolean udlaansstatus) {
        this.udlaansstatus = udlaansstatus;
    }

    @Override
    public String toString() {
        return "boegerDTO{" +
                "titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", udgivelsesaar=" + udgivelsesaar +
                ", ISBN=" + ISBN +
                ", udlaansstatus=" + udlaansstatus +
                '}';
    }
}