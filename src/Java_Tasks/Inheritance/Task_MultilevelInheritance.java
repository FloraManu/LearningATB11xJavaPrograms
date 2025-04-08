package Java_Tasks.Inheritance;

public class Task_MultilevelInheritance {
    public static void main(String[] args)
    {
        Labrador l=new Labrador();
        l.eat();
        l.bark();
        l.display();
    }
}
class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}
class Labrador extends Dog
{
    void display()
    {
        System.out.println("Labrador is a type of Dog");
    }
}
