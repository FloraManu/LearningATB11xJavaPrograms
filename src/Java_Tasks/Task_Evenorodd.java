package Java_Tasks;

import java.util.Scanner;

public class Task_Evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is even or odd");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("The number "+num+" is even");
        else
            System.out.println("The number "+num+" is odd number");
    }
}
