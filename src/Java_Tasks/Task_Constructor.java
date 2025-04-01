package Java_Tasks;

public class Task_Constructor {
    public static void main(String[] args) {

        Person1 p1 = new Person1("Khyathi", 2, "AP", "123456", false);
        //Person P2=new Person();
        p1.eat();
        p1.sleep();
        p1.doHome();
        p1.walk();
        p1.printDetails();
        Person1 p2=new Person1();
        p2.printDetails();

    }
}
    class Person1 {
        String name;
        int age;
        String address;
        String mob_no;
        boolean isMale;

        Person1()
        {
            name="Flora";
            age=24;
            address="trewq";
            mob_no="56789021";
            isMale=false;

        }

        Person1(String name, int age, String address, String mob_no, boolean isMale)
        {
            this.name=name;
            this.age=age;
            this.address=address;
            this.mob_no=mob_no;
            this.isMale=isMale;
        }
        void eat(){
            System.out.println(this.name+ " is eating");
        }
        void sleep()
        {
            System.out.println(this.name+ " is sleeping");
        }
        void walk()
        {
            System.out.println(this.name +" is walking");
        }
        void doHome()
        {
            System.out.println(this.name+ " is done Homework");
        }
        void printDetails()
        {
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Address: "+address);
            System.out.println("MobileNumber: "+mob_no);
            System.out.println("IsMale: "+isMale);
            System.out.println("-------------------------------");
        }
    }

