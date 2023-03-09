package MidtermExample3;
public class Average extends MDAS{
    private int num3, average;
    public void setNum3(int value) {
        num3 = value;
    }
    public void computeAverage() {
        average = (super.getNum1() + super.getNum2() + num3) / 3;
    }
    public int getNum3() {
        return num3;
    }
    public int getAverage() {
        return average;
    }
}
