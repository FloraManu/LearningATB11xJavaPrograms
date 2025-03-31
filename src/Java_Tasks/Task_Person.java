package Java_Tasks;

public class Task_Person {
    public static void main(String[] args) {
        Person p = new Person();
        p.fullname();
        p.mailID("florathallapaka@mail.com");
        p.mobileNo();
        p.details(29,264);
    }
}
       class Person {
           String first_name;
           String last_name;
           int age;
           int id;
           String mobile;
           String Gender;
           String email;
           double salary;

           //1.Without Parameters and without Return Type
            void fullname()
            {
                System.out.println("Full Name:Flora Thallapaka");
            }
            //2.With Parameters and Without Return Type
           void mailID(String email)
           {
               System.out.println("Your mail id is : "+email);
           }
           //3.Without Parameters and  with Return Type
           String mobileNo()
           {
               mobile="9812356853";
               System.out.println("Mobile number is: " + mobile);
               return mobile;
           }
           //4.With Parameters and with Return Type
            String details(int age, int id)
            {
                System.out.println("My age  is: "+ age + " My id is: "+ id);
                return ("age: "+age+"id: "+id);
            }
       }


