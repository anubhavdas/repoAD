package testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ericsson.src.MessageUtil;

public class Test1 {
    String message = "Test1 message";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
	Assert.assertEquals(message, messageUtil.printMessage());
    }
}