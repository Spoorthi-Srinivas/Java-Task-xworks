class Cable{
	String coreMaterial="Copper";
	String colour;
	double lengthInMm;
	double price;
	Cable(String colour,double price)
	{
		System.out.println("Craeted new Cable");
		System.out.println("Cable Colour: "+colour);
		System.out.println("Cable Core Material: "+coreMaterial);
		System.out.println("Cable Cost: "+price);
		
	}
}