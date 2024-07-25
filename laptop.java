class Laptop{
	 public static void connect(int speed)
	 {
	  System.out.println("starting the connect in Laptop");
	  System.out.println("Internet Speed:"+speed+"mb per sec.");
	  System.out.println("Ending the connect in Laptop");
	 }

}


//Laptop--->connect(int speed)--->Router.network(speed)-->Provider-->provide(speed)

//Main--> Laptop.connect(40);