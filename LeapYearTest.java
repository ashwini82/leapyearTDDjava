
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {

    @Test

    public void TestCheckLeapYear() {
        LeapYear lp = new LeapYear();
        assertEquals(true, lp.checkLeapYear(2020));
        assertEquals(false, lp.checkLeapYear(1999));
        assertEquals(true, lp.checkLeapYear(2024));
        assertEquals(false, lp.checkLeapYear(2017));

    }

    @Test
    public void TestIsDivisibleBy4() {
        LeapYear lp1 = new LeapYear();
        assertEquals(true, lp1.isDivisibleBy4(2020));
        assertEquals(false, lp1.isDivisibleBy4(1997));
        assertEquals(true, lp1.isDivisibleBy4(1996));
        assertEquals(false, lp1.isDivisibleBy4(2025));
    }

}