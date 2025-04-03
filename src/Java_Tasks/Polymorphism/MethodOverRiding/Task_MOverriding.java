package Java_Tasks.Polymorphism.MethodOverRiding;

public class Task_MOverriding {
    public static void main(String[] args)
    {
      Dog d=new Dog();
      d.sound();
    }
}
class Animal
{
    void sound()
    {
        System.out.println("Animal Sound!");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println(" Dog Barks");
    }
}