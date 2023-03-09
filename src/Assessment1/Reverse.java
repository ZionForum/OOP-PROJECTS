package Assessment1;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        //Let fName = firstname, lName = lastame, rev = reverse
        //Declaration for string variables
        String fName, lName, rev;
        Scanner s = new Scanner(System.in);
        //Input for strings
        System.out.print("Enter your first name: ");
	fName = s.nextLine();
        System.out.print("Enter your last name: ");
	lName = s.nextLine();
        //Outputs
        System.out.println("Your full name is " + fName + " " + lName);
        //Applying string function "length" to count the total characters
        int length1 = fName.length();
        int length2 = lName.length();
        System.out.println("Your first name has " + length1 + " characters.");
        System.out.println("Your last name has " + length2 + " characters.");
        //Using StringBuffer and reverse to reverse whatever the user inputs
        rev = new StringBuffer(fName + " " + lName).reverse().toString();
        System.out.println("Your name in reverse order: " + rev);
    }
}