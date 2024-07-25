class HotelRunner{
 public static void main(String[] args)
 {
   System.out.println("starting main method in HotelRunner");
   
   double ref1=Hotel.price("Idli");
   System.out.println("the item is Idli");
   System.out.println("price:"+ref1);
   
   double ref2=Hotel.price("Vada");
   System.out.println("the item is Vada");
   System.out.println("price:"+ref2);
   
   double ref3=Hotel.price("Dosa");
   System.out.println("the item is Dosa");
   System.out.println("price:"+ref3);
   
   System.out.println("\n----------------------------\n");
   String ref4=Hotel.answer(5);
   System.out.println("the quantity is 5 ");
   System.out.println("answer:"+ref4);
   
   String ref5=Hotel.answer(0);
   System.out.println("the quantity is 0 ");
   System.out.println("answer:"+ref5);
   
   String ref6=Hotel.answer(102);
   System.out.println("the quantity is 102 ");
   System.out.println("answer:"+ref6);

   System.out.println("Ending main method in HotelRunner");

 }
}
//Saloon Class with Below Methods

//1. Method to take service:haircut,spa,facial,pedicure,headmassage,haircolor,trimming and return price : -1

//Contact Class with Below Method
//1. Method to take name: least 15 and return mobile no: 0

