class Assign{
	 public static void assign(String name,double price,String date,boolean urgent)
	 {
		 System.out.println("Start assign in Assign");
		System.out.println("Person:"+name);
		System.out.println("Price of gift:"+price);
		System.out.println("Date:"+date);
		System.out.println("delivering the gift is urjent:"+urgent);
		Wish.deliver(name,date,urgent);
		System.out.println("End assign in Assign");
	 }
}