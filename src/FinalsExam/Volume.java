package FinalsExam;
public class Volume implements Object{
    //data1 = mass while data2 = density
    private double mass, volume, density;
    @Override
    public void setData1(double value){
        mass=value;
    }
    public void setData2(double value){
        density=value;
    }
    public double getData1(){
        return mass;
    }
    public double getData2(){
        return density;
    }
    @Override
    public void compute(){
        volume = mass / density;
    }
    @Override
    public double getResult(){
        System.out.println("Volume: " + volume);
        return volume;
    }
}