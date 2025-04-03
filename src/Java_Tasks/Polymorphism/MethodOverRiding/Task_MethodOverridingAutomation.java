package Java_Tasks.Polymorphism.MethodOverRiding;

public class Task_MethodOverridingAutomation {
    public static void main(String[] args)
    {
      chrome c=new chrome();
      c.openBrowser();
      firefox f=new firefox();
      f.openBrowser();
      CommonToAll ca=new CommonToAll();
      ca.openBrowser();
    //Dynamic Dispatch
      CommonToAll c1=new chrome();
      c1.openBrowser();
      CommonToAll f1=new firefox();
      f1.openBrowser();
    }
}
class  CommonToAll
{
    void openBrowser()
    {
        System.out.println("Open the Browser");
    }
}
class chrome extends CommonToAll
{
    void openBrowser()
    {
        System.out.println("Chrome Browser will open now");
    }
}
class firefox extends CommonToAll
{
    @Override
    void openBrowser()
    {
        System.out.println("Firefox browser will open now");
    }
}