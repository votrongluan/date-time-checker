import main.DateTimeChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DayInMonthTest {
    @Test
    public void testWithMonthHas31Days() {
        assertEquals(DateTimeChecker.dayInMonth(2000, 1), 31);
        assertEquals(DateTimeChecker.dayInMonth(2000, 3), 31);
        assertEquals(DateTimeChecker.dayInMonth(2000, 5), 31);
        assertEquals(DateTimeChecker.dayInMonth(2000, 7), 31);
        assertEquals(DateTimeChecker.dayInMonth(2000, 8), 31);
        assertEquals(DateTimeChecker.dayInMonth(2000, 10), 31);
        assertEquals(DateTimeChecker.dayInMonth(2000, 12), 31);
    }
    
    public void testWithMonthHas30Days() {
        assertEquals(DateTimeChecker.dayInMonth(2000, 4), 31);
        assertEquals(DateTimeChecker.dayInMonth(2000, 6), 31);
        assertEquals(DateTimeChecker.dayInMonth(2000, 9), 31);
        assertEquals(DateTimeChecker.dayInMonth(2000, 11), 31);
    }
    
    public void testWithMonthHas28Days() {
        assertEquals(DateTimeChecker.dayInMonth(2001, 2), 28);
    }
    
    public void testWithMonthHas29Days() {
        assertEquals(DateTimeChecker.dayInMonth(2000, 2), 29);
    }
}
