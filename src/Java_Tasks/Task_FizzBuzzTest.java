package Java_Tasks;

public class Task_FizzBuzzTest {
    public static void main(String[] args) {
        int N=100;
        for(int i=1;i<=N;i++){
            if(i%3==0 && i%5==0) {
                System.out.println("FizzBuzz "+ i);
            }
            else if (i % 3 == 0){
                System.out.println("Fizz " + i);
            }
            else if(i%5==0){
                System.out.println("Buzz "+i);
            }
            else{
                System.out.println(i);
            }

        }
    }
}
