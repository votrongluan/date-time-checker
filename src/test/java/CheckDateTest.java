import main.DateTimeChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CheckDateTest {
    @Test
    public void testAValidDate() {
        assertTrue(DateTimeChecker.checkDate("11", "05", "2003"));
    }

    public void testAnInvalidDayOfFebruary() {
        assertFalse(DateTimeChecker.checkDate("30", "2", "2001"));
    }

    public void testAnOutOfRangeYear() {
        assertFalse(DateTimeChecker.checkDate("11", "8", "3001"));
    }
}
