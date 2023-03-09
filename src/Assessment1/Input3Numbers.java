package Assessment1;
import java.util.Scanner;
public class Input3Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Input the 1st number: ");
        num1 = s.nextInt();
        System.out.print("Input the 2nd number: ");
        num2 = s.nextInt();
        System.out.print("Input the 3rd number: ");
        num3 = s.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.println("The greatest number is: " + num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("The greatest number is: " + num2);
        }
        else
        {
            System.out.println("The greatest number is: " + num3);
        }
    }
}