package FinalsExam;
public class Density implements Object{
    //data1 = mass while data2 = volume
    private double mass, volume, density;
    @Override
    public void setData1(double value){
        mass=value;
    }
    public void setData2(double value){
        volume=value;
    }
    public double getData1(){
        return mass;
    }
    public double getData2(){
        return volume;
    }
    @Override
    public void compute(){
        density = mass / volume;
    }
    @Override
    public double getResult(){
        System.out.println("Density: " + density);
        return density;
    }
}