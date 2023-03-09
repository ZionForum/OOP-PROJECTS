package Activity3;
import java.util.Scanner;
public class TriangleMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Triangle t = new Triangle(0, 0, 0);
        System.out.print("Input Number for sideA: ");
        t.setSideA(s.nextInt());
        System.out.print("Input Number for sideB: ");
        t.setSideB(s.nextInt());
        System.out.print("Input Number for sideC: ");
        t.setSideC(s.nextInt());
        t.getTriangleType();
    }
}