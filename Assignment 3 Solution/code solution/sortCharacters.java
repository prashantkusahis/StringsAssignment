import java.util.Scanner;
public class sortCharacters {

    public static void sortChar(String str){
        char[] chararr=str.toCharArray();
        // char[] arr = new char[str.length()];
        for(int i=0;i<chararr.length;i++){
            for(int j=i;j<chararr.length;j++){
                if(chararr[i]>chararr[j]){
                    char temp = chararr[i];
                    chararr[i] = chararr[j];
                    chararr[j]=temp;
                }
            }
        }
        System.out.println("Sorted characters are: "+new String(chararr));
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String to sort: ");
        String str= sc.nextLine();
        sortChar(str);
        sc.close();
    }
}
