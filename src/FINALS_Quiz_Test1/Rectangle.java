package FINALS_Quiz_Test1;
public class Rectangle extends Square{
    private int width;
    public Rectangle(int length, int width) {
        super(length);
        this.width = width;
    }
    public void setWidth(int value) {
        width = value;
    }
    public int getWidth() {
        return width;
    }
    @Override
    public void computeArea() {
        area = super.getSide()* width;
    }
    @Override
    public void  computePerimeter() {
        perimeter = 2 * (super.getSide() + width);
    }
}