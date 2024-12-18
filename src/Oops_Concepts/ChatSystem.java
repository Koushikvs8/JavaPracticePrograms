package Oops_Concepts;

public class ChatSystem
{
   String Sender;
   String Reciever;
    public ChatSystem(String Sender ,String Reciever) {
		// TODO Auto-generated constructor stub
    	this.Sender=Sender;
    	this.Reciever=Reciever;
	}
   
   
   public void SelectUserToSend()
   {
	   System.out.println("Selected the reciever : "+Reciever );
   }
   
  public static void send()
  {
	  System.out.println("clicked on send");
  }
   public void edit()
   {
	   System.out.println(" message can be edited");
   }
	
   public void Delete()
   {
	   System.out.println("Deleted");
   }
	
}
