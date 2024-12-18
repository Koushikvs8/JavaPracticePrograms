package Oops_Concepts;

public class Whatsapp extends ChatSystem {

	public Whatsapp(String Sender, String Reciever) {
		super(Sender, Reciever);
		
	}
    
	public static void send()
	{
		System.out.println("clicked on the send and double tick mark is visible");
	}
	
	//Run time polymorfism by overRidening the edit of parent
	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.println("you cant edit this mail as the time is exeeded more then 10min ");
		
	}
	
	
}
