import static org.junit.jupiter.api.Assertions.assertEquals;

import main.code.*;
import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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

    @Test @Order(4)
    public void ztestPrintMessageZ() {
        assertEquals(message, messageUtil.printMessage());
    }

    @Test @Order(3)
    public void testPrintMessageConstructor() {
        MessageUtil m = new MessageUtil("HI");
        assertEquals("HI", m.printMessage());
    }

    @Test @Order(1)
    public void testPrintMessageParameter() {
        MessageUtil m = new MessageUtil();
        assertEquals("Default", m.printMessage("Default"));
        Assertions.assertNotEquals("Hi", m.printMessage("Default"));
    }

    @Test
    @Order(2)
    public void testPrintMessage2() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }

    @AfterAll
    public static void afterALl() {
        System.out.println("After All Setup Started");
    }


}