package Assessment1;
public class Ass2 {
    public static void main(String[] args) {
    String greeting[] = { "D", "E", "H", "L", "O", "0", "L", "R", "O", "L", "W" };
    String message[] = {"A", "0", "G", "I", "G", "M", "0", "L", "M", "O", "P", "O", "R", "I", "N", "R", "E", "V" };
    int count=0;
    long num=12;
    while(num !=0)
    {
        num=num/10;
        count++;
    }
    System.out.println(count);
    System.out.println(greeting[2] + greeting[1] + greeting[3] + greeting[6] + greeting[4] + " " + greeting[10] + greeting[8] + greeting[7] + greeting[9] + greeting[0]);
    System.out.println(message[13] + " " + message[7] + message[9] + message[17] + message[16] + " " + message[10] + message[12] + message[11] + message[2] + message[15] + message[0] + message[8] + message[5] + message[3] + message[14] + message[4]);
    }
}