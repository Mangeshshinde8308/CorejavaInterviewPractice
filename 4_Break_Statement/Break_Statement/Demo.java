
public class Demo {
    public static void main(String[] args) {
        // Example 1: Using break in a loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("i: " + i);
        }

        // Example 2: Using break in a switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; // Break here exits the switch
            default:
                System.out.println("Other day");
        }

    //     int x=10;
    // if(x==10)
    // {           //here we used inside the if block
    //     break; ////we can not directly use break statement outside of loop or switch
    // }

    for(int i=0; i<10; i++)
    {
        if(i==5)
        {
            System.out.println("Breaking the loop at i=5");
            break; // This will exit the loop when i is 5    //here we used inside in but thst if alredy inside of for loop
        }
        System.out.println("Current value of i: " + i);

    

    }
    int i=0;
    while(true){
         if(i==5){
            System.out.println("Breaking the loop at i=5");
            break; // This will exit the loop when i is 5    //--?here also loop hence we can able to use break statement here
            i++;
    }



    
}
