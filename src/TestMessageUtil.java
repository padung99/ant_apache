import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestMessageUtil {

   String message = "Dung";	
   String message_1 = "Dun--g";
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      assertEquals(message_1,messageUtil.printMessage());
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Revision3!" + "Dung";
      assertEquals(message,messageUtil.salutationMessage());
   }
}
