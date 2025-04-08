package Java_Tasks.Inheritance;

public class Task_HierarichalInheritance {
    public static void main(String[] args)
    {
        Employee1 e1=new Employee1();
        e1.CompanyName();
        e1.EmployeeName();
        Employee2 e2=new Employee2();
        e2.CompanyName();
        e2.EmployeeName();
    }
}
class Company
{
    void CompanyName()
    {
        System.out.println("Company name is Testing Academy");
    }
}
class Employee1 extends Company
{
    void EmployeeName()
    {
        System.out.println("Employee1 name is Flora");
    }
}
class Employee2 extends Company
{
    void EmployeeName()
    {
        System.out.println("EMployee2 name is Glory");
    }
}