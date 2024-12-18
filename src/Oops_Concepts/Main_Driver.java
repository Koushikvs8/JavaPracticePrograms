package Oops_Concepts;

public class Main_Driver {
	
	
public static void main(String[] args) {
  Whatsapp w1 = new Whatsapp(null, null);
 w1.send();
 w1.edit();// if we want different edit option 
 
 
 // what if i want to use overrideded edit mehod to my parent class
   ChatSystem c1= new Whatsapp(null, null);
    c1.edit();
    
}
}
