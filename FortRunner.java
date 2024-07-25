class FortRunner{
 public static void main(String[] args)
 {
  System.out.println("starting main method in fortrunner");
  
  String ref1=Fort.fortname("Mysore");
  System.out.println("Location is Mysore");
  System.out.println("Fortname:"+ref1);
  
  String ref2=Fort.fortname("shimoga");
  System.out.println("Location is shimoga");
  System.out.println("Fortname:"+ref2);
  
  String ref3=Fort.fortname("Delhi");
  System.out.println("Location is Delhi");
  System.out.println("Fortname:"+ref3);
  
  String ref4=Fort.fortname("Bengaluru");
  System.out.println("Location is Bengaluru");
  System.out.println("Fortname:"+ref3);
  
  
  System.out.println("ending main method in fortrunner");
 
 }
}