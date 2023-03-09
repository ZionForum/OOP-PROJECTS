package midtermActivity2;
public class Rectangle extends Shape{
    private int area, perimeter;
    public void Area() {
        area = super.getData1() * super.getData2();
    }
    public void Perimeter() {
        perimeter = 2 * (super.getData1() + super.getData2());
    }
    public int getArea() {
        return area;
    }
    public int getPerimeter() {
        return perimeter;
    }
}