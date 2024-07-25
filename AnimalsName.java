class AnimalsName{
	public static void main(String[] args)
	{
	  System.out.println("Start main in AnimalsName");
	  
	  String animal1="Monkey";
	  String animal2="Giraffe";
	  String animal3="Lion";
	  String animal4="Tiger";
	  String animal5="Leopard";
	  String animal6="Wolf";
	  String animal7="Dog";
	  String animal8="Dear";
	  String animal9="Rabbit";
	  String animal10="Elephant";
	  String animal11="Rihnosarus";
	  String animal12="Heppopatamus";
	  String animal13="Cow";
	  String animal14="Yak";
	  String animal15="Zebra";
	  String animal16="Donkey";
	  String animal17="Horse";
	  String animal18="Bear";
	  String animal19="Squirrel";
	  String animal20="Cat";
	  
	  String[] animals={animal1,animal11,animal10,animal7,animal5,animal6,animal4,animal3,animal8,animal9,animal12,animal2,animal17,animal18,animal20,animal19,animal13,animal14,animal16,animal3};
	  
	  int total=animals.length;
	  System.out.println("Total no. of animals: "+total);
	  
	  for(int animName=0;animName<20;animName++)
	  {
	    String animal=animals[animName];
		System.out.println("Animal Name: "+animal);
		
	  }
	  

	  System.out.println("End main in AnimalsName");
	}
}

//6. Store 20 animal names and print reference
