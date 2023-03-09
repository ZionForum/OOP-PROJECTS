package FinalsExam;
import java.util.Scanner;
public class FinalExamMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("[1]Find Mass\n[2]Find Volume\n[3]Find Density\n[4]Exit");
            System.out.print("Input Choice: ");
            choice = s.nextInt();
            if (choice == 1) {
                Mass m = new Mass();
                System.out.print("Input Volume: ");
                m.setData1(s.nextDouble());
                System.out.print("Input Density: ");
                m.setData2(s.nextDouble());
                m.compute();
                m.getResult();
            }
            else if (choice == 2) {
                Volume v = new Volume();
                System.out.print("Input Mass: ");
                v.setData1(s.nextDouble());
                System.out.print("Input Density: ");
                v.setData2(s.nextDouble());
                v.compute();
                v.getResult();
            }
            else if (choice == 3) {
                Density d = new Density();
                System.out.print("Input Mass: ");
                d.setData1(s.nextDouble());
                System.out.print("Input Volume: ");
                d.setData2(s.nextDouble());
                d.compute();
                d.getResult();
            }
            else if (choice == 4){
                break;
            }
            else{
                System.out.println("Invalid Choice, Input from [1-4] only!");
            }
        }while(choice != 4);
    }
}