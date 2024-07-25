class Customer{
	public static boolean tarvel()
	{
	 System.out.println("Start the method travel in Customer");
	 boolean check1=Agency.advanceBook();
	 System.out.println("End the method travel in Customer");
	 return check1;
	}
}