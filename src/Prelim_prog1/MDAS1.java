package Prelim_prog1;
public class MDAS1 {
    //step1: declare all the states(variables) of the class
    private int num1, num2, sum, diff, prod, quo;
    //step2: create the method/s of the class
    //setter (input)
    public void setNum1(int value){
        num1 = value;
    }
    public void setNum2(int value){
        num2 = value;
    }
    //process
    public void Add(){
        sum = num1 + num2;
    }
    public void Subtract(){
        diff = num1 - num2;
    }
    public void Multiply(){
        prod = num1 * num2;
    }
    public void Divide(){
        quo = num1 / num2;
    }
    //output(getter)-non returning
    public void printSum(){
        System.out.println("Sum:" + sum);
    }
    public void printDifference(){
        System.out.println("Difference:" + diff);
    }
    public void printProduct(){
        System.out.println("Product:" + prod);
    }
    public void printQuotient(){
        System.out.println("Quotient:" + quo);
    }
}