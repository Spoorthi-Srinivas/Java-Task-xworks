class CarNamesRev{
	public static void main(String[] args)
	{
		System.out.println("Start main in CarNamesRev");
		
		String car1="BMW";
		String car2="Mercedes Benz";
		String car3="Tesla";
		String car4="Range Rover";
		String car5="Renalut";
		String car6="Ford";
		String car7="Jaguar";
		String car8="Hundai";
		String car9="Oddy";
		String car10="Rolls Royce";
		String car11="Ferrari";
		String car12="Ambasdor";
		String car13="Mahindhra";
		String car14="Lamborghini";
		String car15="Porsche";
		
		String[] cars={car2,car3,car1,car4,car6,car5,car7,car8,car9,car12,car10,car13,car11,car14,car15};
		int total=cars.length;
		System.out.println("Total no of cars: "+total);
		
		 
	  for(int carName=14;carName>=0;carName--)
		{
			String car=cars[carName];
			System.out.println("cars name: "+car);
			
		}
		
		System.out.println("End main in CarNamesRev");
		
	}
}

//5. Store 15 car names and print reference
