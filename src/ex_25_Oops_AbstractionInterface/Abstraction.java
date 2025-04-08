package ex_25_Oops_AbstractionInterface;

public class Abstraction {

}
class ConcreateClass implements Incomplete_Interface{

    @Override
    public void display() {
        System.out.println("Hi");
    }
}

interface Incomplete_Interface{
    int a = 10;
    void display();
}

abstract class Incomplete_abstract{
    abstract void display1();
}