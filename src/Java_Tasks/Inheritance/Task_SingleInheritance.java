package Java_Tasks.Inheritance;

public class Task_SingleInheritance {
    public static void main(String[] args)
    {
        Father f=new Father();
        System.out.println(f.gold);
        f.bhk2();

        Son s=new Son();
        s.bhk3();
        System.out.println(s.gold);
        s.bhk2();
    }
}
class Father
{
    int gold=1000;
    void bhk2()
        {
            System.out.println("Father:BHK2");
        }
}
class Son extends Father
{
    void bhk3()
    {
        System.out.println("Son: BHK3");
    }
}