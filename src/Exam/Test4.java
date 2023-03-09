package Exam;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cube cl = new Cube();
        System.out.print("Input value for side of the cube: ");
        cl.setSide(s.nextInt());
        cl.setArea();
        cl.setVolume();
        System.out.println("Area of the cube: " + cl.getArea());
        System.out.println("Volume of the cube: " + cl.getVolume());
    }
}