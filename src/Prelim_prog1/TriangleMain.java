package Prelim_prog1;
public class TriangleMain {
    public static void main(String[] args) {
        //get
        Triangle t1 = new Triangle(12, 20, 15);
        //process
        t1.Sine();
        t1.Cosine();
        t1.Tangent();
        //output
        System.out.println("Adjacent: " + t1.getAdjacent());
        System.out.println("Hypotenuse: " + t1.getHypotenuse());
        System.out.println("Opposite Sides: " + t1.getOpposite());
        System.out.println("Sine: " + t1.getSine());
        System.out.println("Cosine: " + t1.getCosine());
        System.out.println("Tangent: " + t1.getTangent());
    }
}