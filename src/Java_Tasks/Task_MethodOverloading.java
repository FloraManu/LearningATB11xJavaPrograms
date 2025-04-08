package Java_Tasks;

public class Task_MethodOverloading
{
    public static void main(String[] args) {
    Calculator c=new Calculator();
    int r1=c.add(3,4);
    int r2=c.add(2,7,9);
    double r3=c.add(2.3,4);
    String r4=c.add("hello","world");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
class Calculator
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b,int c)
    {
        return a+b+c;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public String add(String a,String b)
    {
        return a+b;
    }
}