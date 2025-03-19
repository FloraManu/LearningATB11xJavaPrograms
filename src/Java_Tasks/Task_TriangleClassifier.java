package Java_Tasks;

import java.util.Scanner;

public class Task_TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of the triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c)
            System.out.println("Given triangle is equilateral triangle");
        else if (a == b || b == c || c==a) {
            System.out.println("Given triangle is isosceles triangle");
        } else{
            System.out.println(" Given triangle is Scalene triangle ");
        }

    }
}
