public class Turma {
    private String code;
    private int year;

    public Turma(String code, int year) {
        this.code = code;
        this.year = year;
    }

    public String getCode() {
        return code;
    }

    public int getYear() {
        return year;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDados() {
        return "Turma: " + code
                + "\nAno: " + year;
    }

}
