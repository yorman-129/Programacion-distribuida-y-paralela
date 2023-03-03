package co.edu.poli.dto;

public class DTOpersona {
    //atributos publicos o privados
    private String cedula="";
    private String firstName="";
    private String secondName="";
    private String firstLastName="";
    private String secondLastName="";
    private int years=0;
    private double value=0.00;

    public DTOpersona() {
    }

    public DTOpersona(String cedula,String firstName, String secondName, String firstLastName, String secondLastName, int years, double value) {
        this.cedula=cedula;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.years = years;
        this.value = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
