class Queue{
public static String accept(String name, String msg, int quantity)
{
	System.out.println("Start accept in Queue");
	boolean	check = ServiceProvider.send(name,msg);
	if(check==true)
	{
		System.out.println("Message is sent");
		return "sent";
	}
	System.out.println("Message is  Not sent");
		return "Not sent";
}
}