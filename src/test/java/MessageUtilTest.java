import static org.junit.jupiter.api.Assertions.assertEquals;

import main.code.*;
import org.junit.jupiter.api.*;

public class MessageUtilTest {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @BeforeAll
    public static void setUp1() {
        System.out.println("All Setup Started");
    }

    @BeforeEach
    public void setUpEach() {
        System.out.println("Each Setup Started");
    }

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testPrintMessageConstructor() {
        MessageUtil m = new MessageUtil("HI");
        assertEquals("HI", m.printMessage());
    }

    @Test
    public void testPrintMessageParameter() {
        MessageUtil m = new MessageUtil();
        assertEquals("Default", m.printMessage("Default"));
        Assertions.assertNotEquals("Hi", m.printMessage("Default"));
    }

    @Test
    public void testPrintMessage2() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }
}