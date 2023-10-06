import main.DateTimeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMonthTest {
    @Test
    public void testWithMonthHas31Days() {
        assertEquals(31, DateTimeChecker.dayInMonth(2000, 1));
        assertEquals(31, DateTimeChecker.dayInMonth(2000, 3));
        assertEquals(31, DateTimeChecker.dayInMonth(2000, 5));
        assertEquals(31, DateTimeChecker.dayInMonth(2000, 7));
        assertEquals(31, DateTimeChecker.dayInMonth(2000, 8));
        assertEquals(31, DateTimeChecker.dayInMonth(2000, 10));
        assertEquals(31, DateTimeChecker.dayInMonth(2000, 12));
    }

    @Test
    public void testWithMonthHas30Days() {
        assertEquals(30, DateTimeChecker.dayInMonth(2000, 4));
        assertEquals(30, DateTimeChecker.dayInMonth(2000, 6));
        assertEquals(30, DateTimeChecker.dayInMonth(2000, 9));
        assertEquals(30, DateTimeChecker.dayInMonth(2000, 11));
    }

    @Test
    public void testWithMonthHas28Days() {
        assertEquals(28, DateTimeChecker.dayInMonth(2001, 2));
    }

    @Test
    public void testWithMonthHas29Days() {
        assertEquals(29, DateTimeChecker.dayInMonth(2000, 2));
    }
}
