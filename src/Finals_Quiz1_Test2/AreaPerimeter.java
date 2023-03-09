package Finals_Quiz1_Test2;
public class AreaPerimeter extends Triangle{
    private int area, perimeter, height;
    public void setHeight(int value){
        height = value;
    }
    public int getHeight(){
        return height;
    }
    @Override
    public void compute(){
        area=(super.getB()*height) / 2;
        perimeter=super.getA()+super.getB()+super.getC();
    }
    @Override
    public void display(){
        System.out.println("Area of a triangle: " + area);
        System.out.println("Perimeter of a triangle: " + perimeter);
    }
}