package Prelim_prog1;
import java.util.Scanner;
public class prog2A1Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //declare a copy of the class as object
        prog2A1 r = new prog2A1();
        //input
        System.out.print("Enter Length: ");
        r.setLength(s.nextInt());
        System.out.print("Enter Width: ");
        r.setWidth(s.nextInt());
        //process
        r.Area();
        r.Perimeter();
        //output
        System.out.println("Area:" + r.getArea());
        System.out.println("Perimeter:" + r.getPerimeter());
    }
}