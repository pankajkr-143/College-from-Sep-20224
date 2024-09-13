import java.util.Scanner;

public class CompareTo{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        String str = "hello123world";
        int num = 123;
        String numStr = Integer.toString(num);
        int index = str.indexOf(numStr);

        if (index != -1) {
            System.out.println("The index of " + num + " is: " + index);
        } else {
            System.out.println(num + " not found in the string.");
        }
       
        String s1 = "hello is world";
        int index1=s1.indexOf("is");
        int index2=s1.indexOf("world");
        System.out.println(index1+" "+index2);
        int index3 = s1.indexOf("is",4);
        System.out.println();

            try {
                int a[]={1,2,3,4};
                for(int i=1; i<=4; i++){
                    System.out.println("a["+i+"]="+a[i]+"n");
                }
            } 
            catch (Exception e) {
                System.out.println("error="+e);
            }
    
        

    }
}