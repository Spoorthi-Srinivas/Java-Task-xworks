class Counter{
	static double southIndinMeals=80;
	static double northIndinMeals=120;
	static double waterBottel=20;
	static double iceCream=60;
	static double fruitSalad=50;
	static double coffee=10;
    static double tea=10;
	static double badamMilk=15;
	static double juiceBottle=40;

  public static double price(String food){
	  double totalbill=0;
  if(food=="South Indian")
  {
    System.out.println("Food ordered is South Indian");
	totalbill=southIndinMeals;
	 return totalbill;
  }
  if(food=="North Indian")
  {
	  System.out.println("Food ordered is North Indian");
	  totalbill=northIndinMeals;
	  return totalbill;
  }
  return 0;
  }
  
  public static double price(String food, String addItems){
	  double totalbill=0;
  if(food=="South Indian"&&addItems=="iceCream")
  {
	  System.out.println("Food ordered is South Indian and added iceCream");
	  totalbill=southIndinMeals+iceCream;
	  return totalbill;
  }
  if(food=="South Indian"&&addItems=="WaterBottle")
  {
	  System.out.println("Food ordered is South Indian and added waterBottel");
	  totalbill=southIndinMeals+waterBottel;
	  return totalbill;
  }
  if(food=="South Indian"&&addItems=="Fruit Salad")
  {
	  System.out.println("Food ordered is South Indian and added FruitSalad");
	  totalbill=southIndinMeals+fruitSalad;
	  return totalbill;
  }
  if(food=="South Indian"&&addItems=="Coffee")
  {
	  System.out.println("Food ordered is South Indian and added Coffee");
	  totalbill=southIndinMeals+coffee;
	  return totalbill;
  }
  if(food=="South Indian"&&addItems=="Tea")
  {
	  System.out.println("Food ordered is South Indian and added Tea");
	  totalbill=southIndinMeals+tea;
	  return totalbill;
  }
  if(food=="South Indian"&&addItems=="BadamMilk")
  {
	  System.out.println("Food ordered is South Indian and added BadamMilk");
	  totalbill=southIndinMeals+badamMilk;
	  return totalbill;
  }
  if(food=="South Indian"&&addItems=="Juice Bottle")
  {
	  System.out.println("Food ordered is South Indian and added Juice Bottle");
	  totalbill=southIndinMeals+juiceBottle;
	  return totalbill;
  }
  if(food=="North Indian"&&addItems=="iceCream")
  {
	  System.out.println("Food ordered is North Indian and added iceCream");
	  totalbill=northIndinMeals+iceCream;
	  return totalbill;
  }
   if(food=="North Indian"&&addItems=="Water Bottle")
  {
	  System.out.println("Food ordered is North Indian and added Water Bottle");
	  totalbill=northIndinMeals+waterBottel;
	  return totalbill;
  }
   if(food=="North Indian"&&addItems=="Fruit Salad")
  {
	  System.out.println("Food ordered is North Indian and added FruitSalad");
	  totalbill=northIndinMeals+fruitSalad;
	  return totalbill;
  }
   if(food=="North Indian"&&addItems=="Coffee")
  {
	  System.out.println("Food ordered is North Indian and added Coffee");
	  totalbill=northIndinMeals+coffee;
	  return totalbill;
  }
   if(food=="North Indian"&&addItems=="Tea")
  {
	  System.out.println("Food ordered is North Indian and added Tea");
	  totalbill=northIndinMeals+tea;
	  return totalbill;
  }
   if(food=="North Indian"&&addItems=="Badam Milk")
  {
	  System.out.println("Food ordered is North Indian and added Badam Milk");
	  totalbill=northIndinMeals+badamMilk;
	  return totalbill;
  }
   if(food=="North Indian"&&addItems=="Juice Bottle")
  {
	  System.out.println("Food ordered is North Indian and added juiceBottle");
	  totalbill=northIndinMeals+juiceBottle;
	  return totalbill;
  }
  System.out.println("Food Ordered is not valid one Please check the order with main menu");
  return 0;
}
}
