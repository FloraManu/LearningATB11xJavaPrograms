package Java_Tasks;

public class Task_StringBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("khyathi");
        System.out.println("Initial string: "+sb);

        sb.append(" Gracelyn");
        System.out.println("Append:"+sb);

        sb.insert(0,"Beri ");;
        System.out.println("insert: " +sb);

        sb.replace(5,12 ,"Flora");
        System.out.println("replace : "+sb);

        sb.delete(5,11);
        System.out.println("Delete:"+sb);

        sb.reverse();
        System.out.println("Reverse: "+sb);

        sb.reverse();
        System.out.println("Reverse: "+sb);

        int length= sb.length();
       int capacity=sb.capacity();
       System.out.println("length Of:"+ length + " Capacity of: "+capacity);

       sb.setLength(8);
       System.out.println("NewLength: "+sb);

       char ch=sb.charAt(2);
       System.out.println("CharAt: "+ch);

       String result=sb.toString();
       System.out.println("Result: "+result);

       String substring=sb.substring(0,4);
        System.out.println("substring: "+ substring);
    }
}
