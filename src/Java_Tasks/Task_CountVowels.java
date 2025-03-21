package Java_Tasks;
import java.util.Scanner;

public class Task_CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        String str=sc.next();
        int vowels=0;
        int cons=0;
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if((ch == 'a') || (ch == 'e')|| (ch == 'i') || (ch == 'o') || (ch=='u')){
                System.out.println(ch);
                vowels++;
            }
            else if((ch>='a') && (ch<='z')){
               cons++;
            }
        }
        System.out.println("The number of Vowels "+vowels );
        System.out.println("The number of consonants "+cons);
    }
}
