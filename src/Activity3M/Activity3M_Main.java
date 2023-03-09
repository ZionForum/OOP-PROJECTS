package Activity3M;
import java.util.Scanner;
public class Activity3M_Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Age a = new Age("", 2,3);
        System.out.print("Enter Name: ");
        a.setName(s.nextLine());
        System.out.print("Input year today: ");
        a.setYearToday(s.nextInt());
        System.out.print("Input birth year: ");
        a.setBirthYear(s.nextInt());
        a.computeAge();
        a.computeMonths();
        a.computeDays();
        a.computeHours();
        a.computeMinutes();
        a.computeSeconds();
        System.out.println("Your age: " + a.getAge());
        System.out.println("Your age in months: " + a.getMonths());
        System.out.println("Your age in days: " + a.getDays());
        System.out.println("Your age in hours: " + a.getHours());
        System.out.println("Your age in minutes: " + a.getMinutes());
        System.out.println("Your age in seconds: " + a.getSeconds());
    }
}