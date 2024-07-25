class HotelSagarRunner{
 public static void main(String[] args)
 {
	 System.out.println("Start main in HotelSagarRunner");
	 HotelSagar.menu("Panipuri");
	 String item="Panipuri";
	 HotelSagar.menu(item);
	 HotelSagar.menu("Masala Dosa");
	 
	 HotelSagar.menu("Idlivada",35);
	 String item1="IdliVada";
	 double price1=35;
	 HotelSagar.menu(item1,price1);
	 
	 HotelSagar.menu("Panipuri",35,2);
	 String item2="RiceBath";
	 double price2=30;
	 int quantity=2;
	 HotelSagar.menu(item2,price2,quantity);
	 
	 HotelSagar.menu("Panipuri",35,2,"yes");
	 String item3="RiceBath and Masaladosa";
	 double price3=50;
	 int quantity3=3;
     String parcel="yes";
	 HotelSagar.menu(item3,price3,quantity3,parcel);
	 System.out.println("ending the main in HotelSagarRunner");
	 
 }
}