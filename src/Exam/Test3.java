package Exam;
public class Test3 {
    public static void main(String[] args) {
        Person pl = new Person("Juan Dela Cruz", 2000, 2021);
        pl.computeAge();
        System.out.println("Name: " + pl.getName());
        System.out.println("Year Now: " + pl.getYearNow());
        System.out.println("Birth Year: " + pl.getBirthYear());
        System.out.println("Age: " + pl.getAge());
    }
}