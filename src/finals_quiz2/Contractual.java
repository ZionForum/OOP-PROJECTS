package finals_quiz2;
public class Contractual implements Employee {
    protected double rate, hours, gross, tax, bonus, sss, philhealth, pagibig, deduct, net;
    @Override
    public void setRate(double value) {
        rate=value;
    }
    public void setHours(double value) {
        hours=value;
    }
    public double getRate(){
        return rate;
    }
    public double getHours(){
        return hours;
    }
    @Override
    public void computeGross(){
        gross = rate * hours;
    }
    @Override
    public void computeTax(){
        tax = gross * .10;
    }
    @Override
    public void computeSSS(){
        sss = gross * .06;
    }
    @Override
    public void computePhilhealth(){
        philhealth = gross * .05;
    }
    @Override
    public void computePagibig(){
        pagibig = gross * .04;
    }
    @Override
    public void computeDeductions(){
        deduct = tax + sss + philhealth + pagibig;
    }
    @Override
    public void computeNet(){
        bonus=300;
        net = (gross - deduct) + bonus;
    }
    @Override
    public void displayAll(){
        System.out.println("Gross pay: " + String.format("%.2f", gross));
        System.out.println("Tax: " + String.format("%.2f", tax));
        System.out.println("SSS Contribution: " + String.format("%.2f", sss));
        System.out.println("Philhealth Contribution: " + String.format("%.2f", philhealth));
        System.out.println("Pagibig Contribution: " + String.format("%.2f", pagibig));
        System.out.println("Total Deductions: " + String.format("%.2f", deduct));
        System.out.println("Bonus: " + String.format("%.2f", bonus));
        System.out.println("Net pay: " + String.format("%.2f", net));
    }
}