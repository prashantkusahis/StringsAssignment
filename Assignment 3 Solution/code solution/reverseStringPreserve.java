import java.util.Scanner;

public class reverseStringPreserve {

    public static void revStrPreserve(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == ',') {
                sb.append(revStr(str.substring(count, i)));
                sb.append(str.charAt(i));
                count = i + 1; // Update the count for the next word
            }
        }
        
        // Append the last word (if any)
        if (count < str.length()) {
            sb.append(revStr(str.substring(count)));
        }

        System.out.println("The new string is " + sb);
    }

    public static String revStr(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();
        revStrPreserve(str);
        sc.close();
    }
}
