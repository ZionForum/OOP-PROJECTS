package Prelim_prog1;
import java.util.Scanner;
public class prog5B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TriangleLecture t1 = new TriangleLecture(0, 0, 0, 0);
        System.out.println("Input Adjacent: ");
        t1.setAdjacent(s.nextInt());
        System.out.println("Input Base: ");
        t1.setBase(s.nextInt());
        System.out.println("Input Height: ");
        t1.setHeight(s.nextInt());
        System.out.println("Input Hypotenuse: ");
        t1.setHypotenuse(s.nextInt());
        t1.computeArea();
        t1.computePerimeter();
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());
    }
}