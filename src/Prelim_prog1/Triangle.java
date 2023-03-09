package Prelim_prog1;
public class Triangle {
    private int sine, cosine, tangent, adjacent, hypotenuse, opposite;
    //constructor of the class
    public Triangle(int adjacent, int hypotenuse, int opposite) {
        this.adjacent = adjacent;
        this.hypotenuse = hypotenuse;
        this.opposite = opposite;
    }
    //process
    public void Sine() {
        sine=opposite/hypotenuse;
    }
    public void Cosine() {
        cosine=adjacent/hypotenuse;
    }
    public void Tangent() {
        tangent=opposite/adjacent;
    }
    //getter
    public int getAdjacent() {
        return adjacent;
    }
    public int getHypotenuse() {
        return hypotenuse;
    }
    public int getOpposite() {
        return opposite;
    }
    public int getSine() {
        return sine;
    }
    public int getCosine() {
        return cosine;
    }
    public int getTangent() {
        return tangent;
    }
}