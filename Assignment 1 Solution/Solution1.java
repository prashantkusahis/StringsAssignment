import java.util.Scanner;
public class Solution1 {
    public static String revStr(String str){
        //#1: Java program to reverse a string without using the inbuilt method.
        if (str == null || str.length() <= 1) {
            return str;
        }
        char[] arr=new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(str.length()-1-i);
            
        }
        String s=new String(arr);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str=sc.nextLine();
        System.out.println("\nReversed string is : "+revStr(str));

        sc.close();
    }
}
