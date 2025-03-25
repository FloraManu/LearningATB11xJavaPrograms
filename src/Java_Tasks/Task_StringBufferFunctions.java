package Java_Tasks;

public class Task_StringBufferFunctions {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("Append: "+sb);
        sb.insert(5,",");
        System.out.println("Insert: "+sb);

        sb.replace(0,5,"Hi");
        System.out.println("replace: "+ sb);

        sb.delete(2,5);
        System.out.println("Delete: "+sb);

        sb.reverse();
        System.out.println("Reverse:"+sb);

        int length=sb.length();
        int capacity=sb.capacity();
        System.out.println("length: "+ length +" Capacity:"+capacity);

        sb.trimToSize();
        System.out.println("After Trim: "+sb.capacity());

        System.out.println("Substring: "+sb.substring(3));

        // substring(int start, int end)
        System.out.println("Substring in Range: "+sb.substring(3,5));

        //toString()
        System.out.println("To String: "+sb.toString());

        sb.ensureCapacity(50);
        System.out.println("After Ensure Capacity: "+sb.capacity());

    }
}
