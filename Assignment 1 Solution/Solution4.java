import java.util.Scanner;

public class Solution4 {


    public static StringBuffer removechar(String str,char ch){
        StringBuffer sb =new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!= ch){
                sb.append(str.charAt(i));
            }else{
                continue;
            }
        }
        return sb;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine();
        System.out.print("Enter a character : ");
        char ch=sc.next().charAt(0);
        System.out.println("The modified string is "+removechar(str,ch).toString());

        sc.close();
    }
}
