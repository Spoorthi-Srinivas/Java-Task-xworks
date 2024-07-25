class Saloon{
	public static double cost(String service){
		System.out.println("\n starting the cost method\n");
		
		if(service=="Haircut")
		{
			System.out.println("the cost of haircut is");
			return 150;
		}
		
		if(service=="Spa")
		{
			System.out.println("the cost of spa is");
			return 5000;
		}
		
		if(service=="Facial")
		{
			System.out.println("the cost of Facial is");
			return 650;
		}
		
		if(service=="Pedicure")
		{
			System.out.println("the cost of pedicure is");
			return 450;
		}
		
		if(service=="Headmassage")
		{
			System.out.println("the cost of Headmassage is");
			return 220;
		}
		
		if(service=="Trimming")
		{
			System.out.println("the cost of Trimming is");
			return 100;
		}
		if(service=="Haircolor")
		{
			System.out.println("the cost of Haircolor is");
			return 350;
		}
			System.out.println("\n Ending the cost method\n");
			return -1;
	}
} 


//Saloon Class with Below Methods

//1. Method to take service:haircut,spa,facial,pedicure,headmassage,haircolor,trimming and return price : -1