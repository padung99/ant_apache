/*
* This class prints the given message on console.
*/

public class MessageUtil {

   private String message;

   //Constructor \u0420\u00b0\u0420\u00b0\u0420\u00b0\u0420\u00b0\u0420\u00b0\u0420\u00b0\u0420\u00b0\u0420\u00b1\u0420\u00b1\u0420\u00b1\u0420\u00b1\u0420\u00b1\u0420\u00b1\u0420\u00b1\u0420\u00b1\u0420\u00b1
   //@param message to be printed
   public MessageUtil(String message){
      this.message = message; 
   }

   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   
  // add "Revision3!" to the message
   public String salutationMessage(){
      message = "Revision3!" + message;
      System.out.println(message);
      return message;
   }   
}  	
