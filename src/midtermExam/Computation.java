package midtermExam;
public class Computation extends Employee{
    public double gross, tax, sss, philhealth, pagibig, totaldeduct, net, total;
    private int bonus;
    public void cmptGross() {
        gross = super.getRate() * super.getHoursWork();
    }
    public void cmptTax() {
        tax = gross * .12;
    }
    public void cmptSSS() {
        sss = gross * .10;
    }
    public void cmptPhHealth() {
        philhealth = gross *.06;
    }
    public void cmptPagibig() {
        pagibig = gross * .05;
    }
    public void cmptTtlDeduct() {
        totaldeduct = tax + sss + philhealth + pagibig;
    }
    public void cmptNetSalary() {
        net = gross - totaldeduct;
    }
    public void cmptBonus() {
        if(super.getStatus() == 1){
            bonus = 500;
        }
        else{
            bonus = 200;
        }
    }
    public void cmptTtlSalary() {
        total = net + bonus;
    }
    public double getGross() {
        return gross;
    }
    public double getTax() {
        return tax;
    }
    public double getSSS() {
        return sss;
    }
    public double getPhHealth() {
        return philhealth;
    }
    public double getPagibig() {
        return pagibig;
    }
    public double getTtlDeduct() {
        return totaldeduct;
    }
    public double getNetSalary() {
        return net;
    }
    public int getBonus() {
        return bonus;
    }
    public double getTtlSalary() {
        return total;
    }
    public void display() {
        //Outputs
        System.out.println("Employee rate: " + getRate());
        System.out.println("Number of hours worked: " + getHoursWork());
        System.out.println("Gross Salary: " + getGross());
        System.out.println("Tax: " + getTax());
        System.out.println("SSS: " + getSSS());
        System.out.println("Philhealth: " + getPhHealth());
        System.out.println("Pagibig: " + getPagibig());
        System.out.println("Total Deductions: " + getTtlDeduct());
        System.out.println("Net Salary: " + getNetSalary());
        System.out.println("Bonus: " + getBonus());
        System.out.println("Total Salary: " + getTtlSalary());
    }
}