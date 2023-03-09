package Exam;
public class Person {
    //declaration of states
    private String Name;
    private int YearNow, BirthYear, Age;
    //constructor of a class
    public Person(String Name, int BirthYear, int YearNow) {
        this.Name=Name;
        this.BirthYear=BirthYear;
        this.YearNow=YearNow;
    }
    // setter
    public void setName(String value) {
        Name=Name;
    }
    public void setBirthYear(int value) {
        BirthYear=BirthYear;
    }
    public void setYearNow(int value) {
        YearNow=YearNow;
    }
    //process
    public void computeAge() {
        Age=YearNow-BirthYear;
    }
    //getter - returning
    public String getName() {
        return Name;
    }
    public int getYearNow() {
        return YearNow;
    }
    public int getBirthYear() {
        return BirthYear;
    }
    public int getAge() {
        return Age;
    }
}