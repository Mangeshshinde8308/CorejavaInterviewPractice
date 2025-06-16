//package reverse_string;
public class ReverseStringDemo {
    public static void main(String[]args){

        //Method 1: Using CharAt function

        String str="ChaCha";
        int len=str.length();

        String rev="";   // or str=null;
        System.out.println("Origibal String :"+str);

        for(int i=len-1;i>=0; i--)
        {
        rev=rev+str.charAt(i);
        }

        System.out.println("Reversed String using charAt function: " + rev);


        //Method 2: Using StringBuilder
        StringBuilder sb = new StringBuilder(str);  
        String reversedString = sb.reverse().toString();
        System.out.println("Reversed String using StringBuilder: " + reversedString);
    }
}
