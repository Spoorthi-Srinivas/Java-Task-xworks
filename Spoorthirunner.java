class SpoorthiRunner{
	public static void main(String[] args)
	{
		System.out.println("Start main in SpoorthiRunner");
		String status = Spoorthi.sendMsg("Ambani","Do Well",3);
		System.out.println("Message Sent is:"+"Ambani,"+"Do Well,"+"3");
		System.out.println("Message Status:"+status);
		String status1 = Spoorthi.sendMsg("Ambani Son Wedding","Do Well",5);
		System.out.println("Message Sent is:"+"Ambani Son Wedding,"+"Do Well,"+"5");
		System.out.println("Message Status:"+status1);
		System.out.println("End main in SpoorthiRunner");

	}
}