package Finals_Quiz1_Test2;
public abstract class Triangle {
    private int A, B, C;
    public void setA(int value){
        A=value;
    }
    public void setB(int value){
        B=value;
    }
    public void setC(int value){
        C=value;
    }
    public int getA(){
        return A;
    }
    public int getB(){
        return B;
    }
    public int getC(){
        return C;
    }
    public abstract void compute();
    public abstract void display();
}