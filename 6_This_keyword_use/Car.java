
public class Car {
     String cname;
     int cprice;

     Car(String cname, int cprice) {
         this.cname = cname; // Using 'this' to refer to the instance variable   we diffrentiate between the instance variable and the parameter
         this.cprice = cprice; // Using 'this' to refer to the instance variable
     }

     public void display(){
      this.newprcie();                           //we called same class methos using this keyword
        System.out.println("you are procssing method for car: " + cname);
     }

     public Car start(){
        if(cprice > 0 ){
           System.out.println("you can buy this car: ");
        }
        else{
             System.out.println("you can not buy this car: ");
        }
        return this;     //returned this class instances 
        
     }

     public void newprcie(){
        System.out.println("set new price for car");
     }
     
    
}
