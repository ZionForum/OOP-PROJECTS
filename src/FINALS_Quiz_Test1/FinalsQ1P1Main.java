package FINALS_Quiz_Test1;
import java.util.Scanner;
public class FinalsQ1P1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.print("Area and Perimeter Calculator\n[1]Square\n[2]Rectangle\nInput choice: ");
            choice = sc.nextInt();
        }while (choice !=1 && choice !=2);
        if(choice==1){
            Square s = new Square(0);
            System.out.print("Input value for the side: ");
            s.setSide(sc.nextInt());
            s.computeArea();
            s.computePerimeter();
            System.out.println("Area of Square: " + s.getArea());
            System.out.println("Perimeter of Square: " + s.getPerimeter());
        }
        else{
            Rectangle r = new Rectangle(1,2);
            System.out.print("Input value for length: ");
            r.setSide(sc.nextInt());
            System.out.print("Input value for width: ");
            r.setWidth(sc.nextInt());
            r.computeArea();
            r.computePerimeter();
            System.out.println("Area of Square: " + r.getArea());
            System.out.println("Perimeter of Square: " + r.getPerimeter());
        }
    }
}