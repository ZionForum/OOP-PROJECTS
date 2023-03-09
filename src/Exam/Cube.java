package Exam;
public class Cube {
    //declaration of states
    private int side, area, volume;
    //setter
    public void setSide(int value){
        side = value;
    }
    //process
    public void setArea(){
        area = 6*side*side;
    }
    public void setVolume(){
        volume = side*side*side;
    }
    //getter - returning
    public int getSide() {
        return side;
    }
    public int getArea() {
        return area;
    }
    public int getVolume() {
        return volume;
    }
}