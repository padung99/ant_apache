import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestMessageUtil {

   String message = "Dung";
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      assertEquals(message,messageUtil.printMessage());
   }

   @Test
   //public void testSalutationMessage() {
      //System.out.println("Inside testSalutationMessage()");
      message = "Hello!" + "Dung";
      assertEquals(message,messageUtil.salutationMessage());
   }
}
