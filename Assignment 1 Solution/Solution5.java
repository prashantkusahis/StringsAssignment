import java.util.Scanner;

public class Solution5 {

    public static int findSubstringIndex(String originalString, String substringToFind) {
        if(originalString==null||substringToFind==null){
            return -1;
        }
        int index = originalString.indexOf(substringToFind);
        return index;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine();
        System.out.print("Enter a substring : ");
        String strSub=sc.nextLine();
        System.out.println("the index of the substring is: "+findSubstringIndex(str, strSub));
        
        sc.close();

    }
}
