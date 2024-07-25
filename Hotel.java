class Hotel{
 public static double price(String item){
  System.out.println("\nstarting the price method");
  if(item=="Idli")
  {
	 System.out.println("\nthe price of Idli");
	 return 20;
  }
  if(item=="Vada")
  {
	System.out.println("\nthe price of Vada");
	return 15;
  }
  	System.out.println("\nthe item is Not found");

    System.out.println("\nEnding the price method");
	return 0;

 }
 
 public static String answer(double quantity){
	System.out.println("\nstarting the quantity method"); 
	if(quantity>1 && quantity<100)
	{
		return "yes";
	}
	 if(quantity<1 && quantity>100){
		return "no"; 
	 }
		 
	System.out.println("\nEnding the quantity method");
	return "Not valid";
 }
}





//Hotel Class with Below Methods

//1. MEthod to take item and give price: "Not Found": Least 2 items : Idli,Vada
//2. Method to take quantity and return yes or no : quantity is greater that 1 and less that 10 return yes else no
