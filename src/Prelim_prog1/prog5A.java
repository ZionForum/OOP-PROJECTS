package Prelim_prog1;
public class prog5A {
    public static void main(String[] args) {
        //a = 15, b = 17, height = 15, c = 25
        TriangleLecture t1 = new TriangleLecture(15, 17, 15, 25);
        t1.computeArea();
        t1.computePerimeter();
        System.out.println("Adjacent: " + t1.getAdjacent());
        System.out.println("Base: " + t1.getBase());
        System.out.println("Height: " + t1.getHeight());
        System.out.println("Hypotenuse: " + t1.getHypotenuse());
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());
    }
}