package ex_Arrays;

public class Max_MinArrays {
    public static void main(String[] args) {
        int array[]={24,36,14,56,45,43,78};
        int max_result= max_input(array);
        int min_result= min_output(array);
        System.out.println(max_result);
        System.out.println(min_result);

    }

    static int min_output(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    static int max_input(int[] array) {
        int max=array[0];
        for(int i=0;i< array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
     return max;

    }

}