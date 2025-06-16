 package reverse_number;
public class ReverseDemo {
   public static void main(String [] args){
      //methdd 1 using for loop
      int num=1234;
      int rev=0;
      System.out.println("Original Number: " + num);
      while(num!=0){
         rev=rev*10+num%10;
         num=num/10;
      }
      System.out.println("Reversed Number: " + rev);

      //method 2 using StringBuilder
       String number ="12345";
       StringBuilder sb =new StringBuilder(number);
       System.out.println("reverse of number using stringbuilder "+ sb.reverse());
   }
}
