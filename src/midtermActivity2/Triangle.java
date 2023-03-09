package midtermActivity2;
public class Triangle extends Shape{
    private int area, perimeter, a, c;
    public void setSideA(int value){
        a = value;
    }
    public void setSideC(int value){
        c = value;
    }
    public void Area() {
        area = (super.getData1() * super.getData2()) / 2;
    }
    public void Perimeter() {
        perimeter = a + super.getData1() + c;
    }
    public int getSideA() {
        return a;
    }
    public int getSideC() {
        return c;
    }
    public int getArea() {
        return area;
    }
    public int getPerimeter() {
        return perimeter;
    }
}