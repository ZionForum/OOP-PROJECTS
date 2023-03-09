package FINALS_Quiz_Test1;
public class Square {
    private int side;
    protected int area, perimeter;
    public Square(int side) {
        this.side = side;
    }
    public void setSide(int value) {
        side = value;
    }
    public void computeArea() {
        area = side * side;
    }
    public void computePerimeter() {
        perimeter = 4 * side;
    }
    public int getSide() {
        return side;
    }
    public int getArea() {
        return area;
    }
    public int getPerimeter() {
        return perimeter;
    }
}