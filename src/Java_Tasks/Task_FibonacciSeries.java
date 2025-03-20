package Java_Tasks;

import java.util.Scanner;

public class Task_FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number N");
        int n=sc.nextInt();
        int num1=0 ,num2=1;
        System.out.println(num1+" "+num2);
        //int num3=num1+num2;
        for(int i=1;i<=n;++i) {
            //System.out.print("Firstterm" +",");
            int num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;

      }

    }
}
