package Java_Tasks;

public class Task_ArraySecondLargestNumber {
    public static void main(String[] args) {
        int[] a = {34, 56, 87, 90, 26, 13, 55};
        //int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int max = 0;
        int sec_large = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            else if (a[i] > sec_large && a[i] != max) {
                sec_large = a[i];
            }
        }
        System.out.println("Second Largest number in an array is: " + sec_large);
    }
}
