package Prelim_prog1;
public class prog2A1 {
    private int length, width, area, perimeter;
    //setter
    public void setLength(int value){
        length = value;
    }
    public void setWidth(int value){
        width = value;
    }
    public void Area(){
        area = length*width;
    }
    public void Perimeter(){
        perimeter=2*(length+width);
    }
    //getter
    public int getArea(){
        return area;
    }
    public int getPerimeter(){
        return perimeter;
    }
}