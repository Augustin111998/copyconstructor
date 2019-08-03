package copyconstructor;
public class Tester {
 
   private String message;
 
   public Tester(String message){
      this.message = message;
   }
   public Tester(Tester tester){
      this.message = tester.message;
   }
 
   public String getMessage(){
      return message ;
   }
 
   public void setMessage(String message){
      this.message = message;
   }
 
   public static void main(String[] args) {
      Tester tester = new Tester("Welcome");
      System.out.println(tester.getMessage());
   
      Tester tester1 = new Tester(tester);
      System.out.println(tester1.getMessage());  
   }
}   