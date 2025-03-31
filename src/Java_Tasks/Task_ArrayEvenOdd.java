package Java_Tasks;

public class Task_ArrayEvenOdd
{
    public static void main(String[] args) {
        int[] arr = {12, 45, 1, 67, 89, 34, 23, 89};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                System.out.println("Even numbers: " + arr[i]);
            }
             else
             {
            System.out.println("Odd Numbers: " + arr[i]);
             }
       }
    }

}

