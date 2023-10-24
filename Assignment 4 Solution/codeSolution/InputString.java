import java.util.Scanner;
public class InputString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("the entered String is : "+str);

        sc.close();
    }
}
