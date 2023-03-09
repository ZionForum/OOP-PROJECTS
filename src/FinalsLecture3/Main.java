package FinalsLecture3;
import java.util.Scanner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        do{
            System.out.print("[1]MDAS of 2 numbers\n[2]Average of 3 numbers\nInput choice: ");
            choice = s.nextInt();
        }while (choice != 1 && choice != 2);
        if(choice==1)
        {
            MDAS m = new MDAS();
            System.out.print("Enter Number: ");
            m.setNum1(s.nextDouble());
            System.out.print("Enter Number: ");
            m.setNum2(s.nextDouble());
            m.compute();
            m.display();
        }
        else
        {
            Average a = new Average();
            System.out.print("Enter Number: ");
            a.setNum1(s.nextDouble());
            System.out.print("Enter Number: ");
            a.setNum2(s.nextDouble());
            System.out.print("Enter Number: ");
            a.setNum3(s.nextDouble());
            a.compute();
            a.display();
        }
    }
}