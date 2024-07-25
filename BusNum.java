class BusNum{
	public static void main(String[] args)
	{
	  System.out.println("Start main in BusNum");
	   
	   String busno1="226N";
	   String busno2="k2";
	   String busno3="60";
	   String busno4="248";
	   String busno5="227";
	   String busno6="KBS3E";
	   String busno7="25";
	   String busno8="234";
	   String busno9="401";
	   String busno10="MF-12";
	   
	   
	   String[] busnos={busno1,busno2,busno3,busno4,busno5,busno6,busno7,busno8,busno9,busno10};
	    
		int total=busnos.length;
		System.out.println("total no of Bus Route Num: "+total);
		
		for(int bsnum=0;bsnum<10;bsnum++)
		{
			String busNum=busnos[bsnum];
			System.out.println("Bus Route no: "+busNum);
		}
	   
	  System.out.println("End main in BusNum");
	}  
}

//8. Store 5 busNo and print reference