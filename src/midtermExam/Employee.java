package midtermExam;
public class Employee {
    private int hoursWork, status;
    private double rate;
    public void setRate(double value){
        rate = value;
    }
    public void setHoursWork(int value){
        hoursWork = value;
    }
    public void setStatus(int value){
        status = value;
    }
    public double getRate(){
        return rate;
    }
    public int getHoursWork(){
        return hoursWork;
    }
    public int getStatus(){
        return status;
    }
}