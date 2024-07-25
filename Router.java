class Router{
	public static void network(int speed)
	{
		System.out.println("Starting network in Router");
		Laptop.connect(speed);
		System.out.println("Ending network in Router");
	}
}

