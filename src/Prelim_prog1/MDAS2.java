package Prelim_prog1;
public class MDAS2 {
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
    //getter
    public int getSum(){
        return sum;
    }
    public int getDifference(){
        return diff;
    }
    public int getProduct(){
        return prod;
    }
    public int getQuotient(){
        return quo;
    }
}