package Activity3M;
public class Person {
    private String name;
    private int yearToday, birthYear;
    public Person (String name, int yearToday, int birthYear){
        this.name = name;
        this.yearToday = yearToday;
        this.birthYear = birthYear;
    }
    public void setName(String value){
        name = value;
    }
    public void setYearToday(int value){
        yearToday = value;
    }
    public void setBirthYear(int value){
        birthYear = value;
    }
    public String getName(){
        return name;
    }
    public int getYearToday(){
       return yearToday;
    }
    public int getBirthYear(){
        return birthYear;
    }
}