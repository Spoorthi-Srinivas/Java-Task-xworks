class ShoeCustomer{
	public static void main(String[] args)
	{
		System.out.println("Start main in ShoeCustomer");
		double price=ShoeShop.purchase("Puma");
		System.out.println("Shoe Brand is Puma");
		System.out.println("shoe price is:"+price);
		System.out.println("End main in ShoeCustomer");
	}
}