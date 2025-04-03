package Java_Tasks.MethodOverloading;

public class Task_PolyMethodOverloading {
    public static void main(String[] args)
    {
        MathOperations m1=new MathOperations();
       int r1= m1.add(2,4);
       double r2=m1.add(3.4,5.6);
       int r3=m1.add(4,6,8);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3)  ;

    }
}
class MathOperations
{
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    double add(double a, double b)
    {
        return a+b;
    }
    String add(String a, String b)
    {
        return a+b;
    }
}
