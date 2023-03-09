package FinalsLecture2;
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
            FinalsLecture1.MDAS m = new FinalsLecture1.MDAS(10,5);
            System.out.print("Enter Number: ");
            m.setNum1(s.nextInt());
            System.out.print("Enter Number: ");
            m.setNum2(s.nextInt());
            m.compute();
            m.display();
        }
        else
        {
            FinalsLecture1.Average a = new FinalsLecture1.Average(10, 5, 1);
            System.out.print("Enter Number: ");
            a.setNum1(s.nextInt());
            System.out.print("Enter Number: ");
            a.setNum2(s.nextInt());
            System.out.print("Enter Number: ");
            a.setNum3(s.nextInt());
            a.compute();
            a.display();
        }
    }
}