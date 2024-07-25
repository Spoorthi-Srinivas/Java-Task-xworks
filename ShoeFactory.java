class ShoeFactory{
public static double orderprice(String brand)
{
	System.out.println("Start order in ShopFactory");
	if(brand=="Puma")
	{
		System.out.println("Puma");
		return 1500;
	}
	if(brand=="Nike")
	{
		System.out.println("Nike");
		return 2000;
	}
	System.out.println("End order in ShopFactory");
	return 0;
}

}
