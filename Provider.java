class Provider{
	public static void provide(int speed)
	{
		System.out.println("Starting provide in Provider");
		Router.network(speed);
		System.out.println("Ending provide in Provider");
	}
}