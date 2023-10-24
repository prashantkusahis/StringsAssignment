public class removeConsonant {
    public static void main(String[] args) {
        String str="Hello, have a good day";
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i' ||str.charAt(i)=='o'|| str.charAt(i)=='u'){
                continue;
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println("The new modified string is: "+ sb);
    }
}
