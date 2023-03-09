package Finals_Quiz1_Test2;
public class SOHCAHTOA extends Triangle {
    private int sine, cosine, tangent;
    @Override
    public void compute(){
        sine=super.getB()/super.getC();
        cosine=super.getA()/super.getC();
        tangent=super.getB()/super.getA();
    }
    @Override
    public void display(){
        System.out.println("Sine: " + sine);
        System.out.println("Cosine: " + cosine);
        System.out.println("Tangent: " + tangent);
    }
}