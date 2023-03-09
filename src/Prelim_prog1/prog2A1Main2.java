package Prelim_prog1;
import java.util.Scanner;
public class prog2A1Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        prog2A1Class2 r = new prog2A1Class2();
        System.out.print("Enter Length: ");
        r.setLength(s.nextInt());
        System.out.print("Enter Width: ");
        r.setWidth(s.nextInt());
        r.Area();
        r.Perimeter();
        r.printArea();
        r.printPerimeter();
    }
}