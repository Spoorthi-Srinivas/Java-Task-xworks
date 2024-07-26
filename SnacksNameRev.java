class SnacksNameRev{

public static void main(String[] args)
	{
	  System.out.println("Start main in SnacksNameRev");
	  
	  String snack1="Samosa";
	  String snack2="Sev Puri";
	  String snack3="Bel Puri";
	  String snack4="Niput Masala";
	  String snack5="Vada Pav";
	  String snack6="Pav Bajji";
	  String snack7="Pani Puri";
	  String snack8="Gobi Manchurian";
	  String snack9="Noodles";
	  String snack10="Dhahi Puri";
	  String snack11="Onion Pakoda";
	  String snack12="Mirchi Boda";
	  String snack13="manguluru Bajji";
	  String snack14="Germit";
	  String snack15="Veg Cutlet";
	  String snack16="Aloo Tikki";
	  String snack17="Dhokla";
	  String snack18="Masal Puri";
	  String snack19="Momos";
	  String snack20="Madhur Vade";
	  String snack21="Sandwitch";
	  String snack22="Paneer Pakoda";
	  String snack23="Masala Vade";
	  String snack24="Golgappa";
	  String snack25="Shankarpalli";
	  String snack26="Peanut Chikki";
	  
	  String[] snacks={snack1,snack2,snack3,snack4,snack5,snack6,snack7,snack8,snack9,snack10,snack11,snack12,snack13,snack14,snack15,snack16,snack17,snack18,snack19,snack20,snack21,snack22,snack23,snack24,snack25,snack26};
	  
	  int total=snacks.length;
		System.out.println("Total no of snacks: "+total);
		
		 
	  for(int snackName=25;snackName>=0;snackName--)
		{
			String snack=snacks[snackName];
			System.out.println("Snack name: "+snack);
			
		}
	  
	  
	  
	  
	  System.out.println("End main in SnacksNameRev");
	}
}
//7. Store 25 snack names and print reference
