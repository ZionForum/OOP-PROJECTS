package Prelim_prog1;
public class TriangleLecture {
    private int adjacent, base, height, hypotenuse, area, perimeter;
    public TriangleLecture(int adjacent, int base, int height, int perimeter) {
        this.adjacent=adjacent;
        this.base=base;
        this.height=height;
        this.perimeter=perimeter;
    }
    public void setAdjacent(int value) {
        adjacent=value;
    }
    public void setBase(int value) {
        base=value;
    }
    public void setHeight(int value) {
        height=value;
    }
    public void setHypotenuse(int value) {
        hypotenuse=value;
    }
    public void computeArea() {
        area = (base * height) / 2;
    }
    public void computePerimeter() {
        perimeter = adjacent + base + hypotenuse;
    }
    public int getAdjacent() {
        return adjacent;
    }
    public int getBase() {
        return base;
    }
    public int getHeight() {
        return height;
    }
    public int getHypotenuse() {
        return hypotenuse;
    }
    public int getArea() {
        return area;
    }
    public int getPerimeter() {
        return perimeter;
    }
}
