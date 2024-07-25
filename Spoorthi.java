class Spoorthi{
	public static String sendMsg(String name, String msg, int quantity)
	{
		System.out.println("Start sendMSg in Spoorthi");
		String status= Queue.accept(name,msg,quantity);
		return status;
	}
}