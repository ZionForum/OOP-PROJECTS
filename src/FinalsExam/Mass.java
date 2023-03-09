package FinalsExam;
public class Mass implements Object{
    //data1 = volume while data2 = density
    private double mass, volume, density;
    @Override
    public void setData1(double value){
        volume=value;
    }
    public void setData2(double value){
        density=value;
    }
    public double getData1(){
        return volume;
    }
    public double getData2(){
        return density;
    }
    @Override
    public void compute(){
        mass = density * volume;
    }
    @Override
    public double getResult(){
        System.out.println("Mass: " + mass);
        return mass;
    }
}