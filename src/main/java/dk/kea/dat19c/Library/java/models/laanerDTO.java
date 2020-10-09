package dk.kea.dat19c.Library.java.models;

public class laanerDTO {
    private int CPR;
    private String email;
    private int telefonnummer;
    private int pinkode;

    public laanerDTO(int CPR, String email, int telefonnummer, int pinkode) {
        this.CPR = CPR;
        this.email = email;
        this.telefonnummer = telefonnummer;
        this.pinkode = pinkode;
    }

    public int getCPR() {
        return CPR;
    }

    public void setCPR(int CPR) {
        this.CPR = CPR;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public int getPinkode() {
        return pinkode;
    }

    public void setPinkode(int pinkode) {
        this.pinkode = pinkode;
    }

    @Override
    public String toString() {
        return "laanerDTO{" +
                "CPR=" + CPR +
                ", email='" + email + '\'' +
                ", telefonnummer=" + telefonnummer +
                ", pinkode=" + pinkode +
                '}';
    }
}
