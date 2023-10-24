import java.util.Scanner;
public class Solution2 {

    //#2: Java program to check if the given string is a palindrome or not?

    public static boolean isPalindrome(String str){
        
        String s1= new String();
        s1=Solution1.revStr(str);
        if(s1.equals(str)){
            return true;
        }
        return false;

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
            System.out.print("Enter a string to check if it is a palindrome: ");
            String str=sc.nextLine();
            boolean chckbool=isPalindrome(str);
            if(chckbool){
                System.out.println("The entered string is a Palindrome.");
            }else{
                System.out.println("The entered string is not a Palindrome.");
            }
                    
        sc.close();
    }
}
