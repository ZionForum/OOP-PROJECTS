package Activity3;
public class Triangle {
    private int sideA, sideB, sideC;
    String triangleType;
    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    public void setSideA(int value) {
        sideA = value;
    }
    public void setSideB(int value) {
        sideB = value;
    }
    public void setSideC(int value) {
        sideC = value;
    }
    public String getTriangleType() {
        if(sideA == sideB && sideB == sideC && sideA == sideC)
        {
            System.out.println("Equivalent Triangle");
        }
        else if(sideA == sideB || sideB == sideC || sideA == sideC)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
        return null;
    }
    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public int getSideC() {
        return sideC;
    }
}