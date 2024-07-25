class Fort{
 public static String fortname(String location){
	 System.out.println("starting the method fortname");
	 if(location=="Mysore")
	 {
		 
		 return "Tippusulthan fort";
	 }
	 if(location=="Delhi")
	 {
		 
		 return "Red fort";
	 }
	 if(location=="shimoga")
	 {
		 
		 return "Shivappanakya fort";
	 }

 System.out.println("ending the method fortname");
 return "Not Matching";
 
}
}