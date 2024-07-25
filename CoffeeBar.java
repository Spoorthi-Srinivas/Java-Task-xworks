class CoffeeBar{
public static void sellCoffee(String item,double price)
{
 System.out.println("Start sellCoffee in CoffeeBar");
 System.out.println("Item:"+item);
 System.out.println("Price:"+price);
 Shop.makeCoffee(item,price);
 System.out.println("End sellCoffee in CoffeeBar");
}
}