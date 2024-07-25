class Harsha{
public static void drinkCoffee(String item,double price)
{
 System.out.println("Start drinkCoffee in Harsha");
 System.out.println("Item:"+item);
 System.out.println("Price:"+price);
 CoffeeBar.sellCoffee(item,price);
 System.out.println("End drinkCoffee in Harsha");
}
}