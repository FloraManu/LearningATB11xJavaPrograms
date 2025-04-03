package Java_Tasks.Polymorphism;

public class Task_MOverloading {
    public static void main(String[] args)
    {
        Addition a=new Addition();
        a.task(3);
        a.task(3,5,6);
        a.task(4,9);

    }
}
class Addition
{
    void task(int a)
    {
        System.out.println(a);
    }
    void task(int a, int b)
    {
        System.out.println(a+b);
    }
    void task(int a,int b, int c)
    {
        System.out.println(a+b+c);
    }
}
