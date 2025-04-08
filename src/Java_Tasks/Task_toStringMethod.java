package Java_Tasks;

public class Task_toStringMethod
{
    public static void main(String[] args)
    {
        Student[] s=new Student[3];
        s[0]=new Student("Flora",26,"Kadapa");
        s[1]=new Student("Glory",64,"Bangalore");
        s[2]=new Student("Shirli",25,"Pulivendula");
        System.out.println("Student details: ");
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
}
class Student
{
    String name;
    int id;
    String city;
     Student(String name,int id,String city)
    {
        this.name=name;
        this.id=id;
        this.city=city;
    }
    public String toString()
    {
        return name+" "+id+" "+city+" ";
    }
}