package dk.kea.dat19c.Library.java.models;

public class laenerDTO {
    private int CPR;
    private String email;
    private int year;
    private int ISBN;
    private boolean status;

    public boegerDTO(String titel, String forfatter, int year, int ISBN, boolean status) {
        this.titel = titel;
        this.forfatter = forfatter;
        this.year = year;
        this.ISBN = ISBN;
        this.status = status;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "boegerDTO{" +
                "titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", year=" + year +
                ", ISBN=" + ISBN +
                ", status=" + status +
                '}';
    }
}
