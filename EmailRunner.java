class EmailRunner{
 public static void main(String[] args)
 {
  System.out.println("starting main in EmailRunner");
  Email.sendMsg("Please do complete the task within the deadline");
  Email.sendMsg("Thank you. Have a Good Day.");
  System.out.println("Ending main in EmailRunner");
 }
}