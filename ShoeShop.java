class ShoeShop{
public static double purchase(String brand)
{
 System.out.println("Start purchase in ShoeShop");
 double price=ShoeFactory.orderprice(brand);
 System.out.println("End purchase in ShoeShop");
 return price;
}
}