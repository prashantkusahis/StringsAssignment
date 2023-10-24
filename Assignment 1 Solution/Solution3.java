import java.util.Scanner;

public class Solution3 {

    public static void toUpperLower(String str){
        //#3:WAP to convert uppercase to lowercase and vice versa.
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            int chck=str.charAt(i);
            if(!(chck>=65 && chck<=90) && !(chck>=97 && chck<=122)){
                sb.append(str.charAt(i));
                
            }else if(chck>=65 && chck<=90){
                sb.append((char)(chck+32));
                
            }
            else if(chck>=97 && chck<=122){
                sb.append((char)(chck-32));
            }
        }
        System.out.println("Changes upperase to lower case and lower case to upper case");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string to change lower cases to upper cases and upper cases to lower cases: ");
        String str=sc.nextLine();
        System.out.println("New string is : ");
         toUpperLower(str);

         sc.close();
    }
}
