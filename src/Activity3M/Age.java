package Activity3M;
public class Age extends Person{
    private int age, years=12, month=30, days=24, hrs=60, mins=60, secs=60, ageMonths, ageDays, ageHrs, ageMins, ageSecs;
    public Age (String name, int yearToday, int birthYear){
        super(name, yearToday, birthYear);
    }
    public void computeAge() {
        age = super.getYearToday() - super.getBirthYear();
    }
    public void computeMonths() {
        ageMonths = age * years;
    }
    public void computeDays() {
        ageDays = ageMonths * month;
    }
    public void computeHours() {
        ageHrs = ageDays * days;
    }
    public void computeMinutes() {
        ageMins = ageHrs * hrs;
    }
    public void computeSeconds() {
        ageSecs = ageMins * mins;
    }
    public int getAge(){
        return age;
    }
    public int getMonths(){
        return ageMonths;
    }
    public int getDays(){
        return ageDays;
    }
    public int getHours(){
        return ageHrs;
    }
    public int getMinutes(){
        return ageMins;
    }
    public int getSeconds(){
        return ageSecs;
    }
}