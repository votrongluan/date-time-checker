import main.DateTimeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckDateTest {
    // Luan (1-3)
    @Test
    public void testAValidDate() {
        assertTrue(DateTimeChecker.checkDate("11", "05", "2003"));
        assertTrue(DateTimeChecker.checkDate("29", "01", "2003"));
        assertTrue(DateTimeChecker.checkDate("25", "02", "2004"));
        assertTrue(DateTimeChecker.checkDate("31", "03", "2005"));
        assertTrue(DateTimeChecker.checkDate("30", "04", "2006"));
        assertTrue(DateTimeChecker.checkDate("31", "05", "2007"));
        assertTrue(DateTimeChecker.checkDate("30", "06", "2008"));
        assertTrue(DateTimeChecker.checkDate("31", "07", "2009"));
        assertTrue(DateTimeChecker.checkDate("31", "08", "2010"));
        assertTrue(DateTimeChecker.checkDate("30", "09", "2011"));
        assertTrue(DateTimeChecker.checkDate("31", "10", "2012"));
        assertTrue(DateTimeChecker.checkDate("30", "11", "2013"));
        assertTrue(DateTimeChecker.checkDate("31", "12", "2014"));
    }

    @Test
    public void testAnInvalidDayOfFebruary() {
        assertFalse(DateTimeChecker.checkDate("30", "2", "2001"));
        assertFalse(DateTimeChecker.checkDate("31", "2", "2000"));
        assertFalse(DateTimeChecker.checkDate("29", "2", "2003"));
    }

    @Test
    public void testAnOutOfRangeYear() {
        assertFalse(DateTimeChecker.checkDate("11", "8", "3001"));
        assertFalse(DateTimeChecker.checkDate("11", "8", "5000"));
        assertFalse(DateTimeChecker.checkDate("11", "8", "0"));
        assertFalse(DateTimeChecker.checkDate("11", "8", "10"));
    }

    // Nam (4-6)

    // Phuc (7-9)

    // Anh (10-12)

    // Quang (13-15)
    @Test
    public void testANullDay() {
        assertFalse(DateTimeChecker.checkDate(null, "1", "2000"));
    }

    @Test
    public void testANullMonth() {
        assertFalse(DateTimeChecker.checkDate("1", null, "2000"));
    }

    @Test
    public void testANullYear() {
        assertFalse(DateTimeChecker.checkDate("1", "1", null));
    }

}
