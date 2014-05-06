package testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ericsson.src.MessageUtil;

public class Test2 {
    String message = "Test2 message";	
    MessageUtil messageUtil = new MessageUtil(message);
	 
    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Test2 message";
        Assert.assertEquals(message,messageUtil.salutationMessage());
    }
}