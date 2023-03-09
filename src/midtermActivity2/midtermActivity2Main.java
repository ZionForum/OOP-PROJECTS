package midtermActivity2;
import java.util.Scanner;
public class midtermActivity2Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int choice = 0;
        do
        {
            System.out.println("[1] Rectangle\n[2] Triangle");
            System.out.print("Input Choice: ");
            choice = sr.nextInt();
        }
        while(choice != 1 && choice != 2);
        if(choice == 1) {
            Rectangle r = new Rectangle();
            System.out.print("Enter Length: ");
            r.setData1(sr.nextInt());
            System.out.print("Enter Width: ");
            r.setData2(sr.nextInt());
            r.Area();
            r.Perimeter();
            System.out.println("Area of a Rectangle: " + r.getArea());
            System.out.println("Perimeter of a Rectangle: " + r.getPerimeter());
        }
        else{
            Triangle t = new Triangle();
            System.out.print("Enter A: ");
            t.setSideA(sr.nextInt());
            System.out.print("Enter Base: ");
            t.setData1(sr.nextInt());
            System.out.print("Enter C: ");
            t.setSideC(sr.nextInt());
            System.out.print("Enter Height: ");
            t.setData2(sr.nextInt());
            //process
            t.Area();
            t.Perimeter();
            //output
            System.out.println("Area of a Triangle: " + t.getArea());
            System.out.println("Perimeter of a Triangle: " + t.getPerimeter());
        }
    }
}