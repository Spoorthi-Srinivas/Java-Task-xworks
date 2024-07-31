class MaterialRunner{
	
	public static void main(String[] values)
	{
		Watch watch=new Watch("Fastrack",2500);
		watch.colour="Black";
		System.out.println("Watch colour: "+watch.colour);
		System.out.println("\n");
		
		Cable cable=new Cable("Red",500);
		cable.lengthInMm=200;
		System.out.println("Cable Length: "+cable.lengthInMm);
		System.out.println("\n");
		
		Radio radio=new Radio("Radio Merchi(93.5)",850);
		radio.frequencyInHz="3 kilohertz up to 3,000 gigahertz";
		System.out.println("Radio Frequency: "+radio.frequencyInHz);
		System.out.println("\n");
		
		Trumpet trumpet=new Trumpet(3500,"Brass");
		trumpet.valvesNum=3;
		System.out.println("Number of Valves in trumpet: "+trumpet.valvesNum);
		System.out.println("\n");
		
		Harmonica harmonica=new Harmonica(2500,"Brass");
		harmonica.musicGenres="American Folk Music";
		System.out.println("Harmonica Music genres: "+harmonica.musicGenres);
		System.out.println("\n");
		
		Pendulum pendulum=new Pendulum("Invar",950);
		pendulum.uses="Pendulum used in Clocks, Swing sets, etc.";
		System.out.println("Uses of Pendulum: "+pendulum.uses);
		System.out.println("\n");
		
		Straightner straightner=new Straightner(80,2850);
		straightner.quantity=2;
		System.out.println("Staightner Quantity: "+straightner.quantity);
		System.out.println("\n");
		
		Mask mask=new Mask("Cotton",150);
		mask.quantity=5;
		System.out.println("Mask quantity: "+mask.quantity);
	    System.out.println("\n");
		
		Mug mug=new Mug(10,1800);
		mug.material="Ceramic";
		System.out.println("Mug material: "+mug.material);
	    System.out.println("\n");
		
		Anklets anklets=new Anklets("2 pairs",12800);
		anklets.design="Simple";
		System.out.println("Anklets Design: "+anklets.design);
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		
	}
}