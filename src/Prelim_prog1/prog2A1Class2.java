package Prelim_prog1;
public class prog2A1Class2 {
    private int length, width, area, perimeter;
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
    public void printArea(){
        System.out.println("Area: " + area);
    }
    public void printPerimeter(){
        System.out.println("Perimeter: " + perimeter);
    }
}