package Java_Tasks;

import java.util.Scanner;

public class Task_CLI1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String name=sc.next();
        System.out.println("Enter the Age");
        int age=sc.nextInt();
        System.out.println("Enter the salary");
        double salary=sc.nextDouble();
        System.out.println("Name is " +name+ " Age is "+age+" Salary is "+salary);

    }
}
