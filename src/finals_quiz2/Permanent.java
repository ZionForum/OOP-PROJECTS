package finals_quiz2;
public class Permanent extends Contractual{
    @Override
    public void computeSSS(){
        sss = gross * .08;
    }
    @Override
    public void computePhilhealth(){
        philhealth = gross * .07;
    }
    @Override
    public void computePagibig(){
        pagibig = gross * .06;
    }
    @Override
    public void computeDeductions(){
        deduct = tax + sss + philhealth + pagibig;
    }
    @Override
    public void computeNet(){
        bonus=500;
        net = (gross - deduct) + bonus;
    }
}