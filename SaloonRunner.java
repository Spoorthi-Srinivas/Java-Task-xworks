class SaloonRunner{
 public static void main(String[] args)
 {
   System.out.println("starting main method in SaloonRunner");
   
   double ref1=Saloon.cost("Haircut");
   System.out.println("the service is Haircut");
   System.out.println("price:"+ref1);
   
   double ref2=Saloon.cost("Spa");
   System.out.println("the service is Spa");
   System.out.println("price:"+ref2);
   
   double ref3=Saloon.cost("Trimming");
   System.out.println("the service is Haircut");
   System.out.println("price:"+ref3);

   double ref4=Saloon.cost("Haircolor");
   System.out.println("the service is Haircolor");
   System.out.println("price:"+ref4);
   
   double ref5=Saloon.cost("Facial");
   System.out.println("the service is Facial");
   System.out.println("price:"+ref5);
   
   double ref6=Saloon.cost("Pedicure");
   System.out.println("the service is Pedicure");
   System.out.println("price:"+ref6);
   
   double ref7=Saloon.cost("Headmassage");
   System.out.println("the service is Headmassage");
   System.out.println("price:"+ref7);
   
   
    System.out.println("Ending main method in SaloonRunner");
}

}
