class MessageProvider{
	public static boolean send(String name, String msg)
	{
		System.out.println("Start send in MessageProvider");
		if(name=="Ambani"&&msg=="Do Well")
		{
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;
	}
}