class ServiceProvider{
public static boolean send(String name, String msg)
{
	System.out.println("Start send in ServiceProvider");
	boolean csk= MessageProvider.send(name,msg);
	return csk;
}
}