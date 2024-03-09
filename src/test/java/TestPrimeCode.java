import main.code.PrimeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPrimeCode {

    @Test
    public void noArgConsTest()
    {
       PrimeNumber p = new PrimeNumber();
        assertTrue(p.CheckPrime());
    }

    @Test
    public void argConsTest()
    {
        PrimeNumber p = new PrimeNumber(10);
        assertFalse(p.CheckPrime());
    }

    @Test
    public void primeTest()
    {
        PrimeNumber p = new PrimeNumber(2);
        assertTrue(p.CheckPrime());
    }
}
