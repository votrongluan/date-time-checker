import main.DateTimeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckDateTest {
    // TODO: Luan (1-3)
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
    public void testAnOutOfRangeMonth() {
        assertFalse(DateTimeChecker.checkDate("11", "32", "2000"));
        assertFalse(DateTimeChecker.checkDate("11", "13", "2000"));
        assertFalse(DateTimeChecker.checkDate("11", "15", "2000"));
        assertFalse(DateTimeChecker.checkDate("11", "1000", "2000"));
    }

    // TODO: Nam (4-6)
    @Test
    public void testAnOutRangeOfYear() {
        assertFalse(DateTimeChecker.checkDate("12", "7", "10000"));
        assertFalse(DateTimeChecker.checkDate("22", "2", "9999"));
        assertFalse(DateTimeChecker.checkDate("23", "5", "0333"));
        assertFalse(DateTimeChecker.checkDate("30", "6", "0099"));
    }

    @Test
    public void testAValidDayOfLeafYear() {
        assertFalse(DateTimeChecker.checkDate("29", "2", "2001"));
        assertFalse(DateTimeChecker.checkDate("29", "2", "2002"));
        assertFalse(DateTimeChecker.checkDate("29", "2", "2003"));
        assertFalse(DateTimeChecker.checkDate("29", "2", "2005"));
    }

    @Test
    public void testAnInvalidDayOfLeafYear() {
        assertFalse(DateTimeChecker.checkDate("29", "2", "2018"));
        assertFalse(DateTimeChecker.checkDate("29", "2", "2003"));
        assertFalse(DateTimeChecker.checkDate("29", "2", "2009"));
        assertFalse(DateTimeChecker.checkDate("29", "2", "2013"));
    }

    // TODO: Phuc (7-9)
    @Test
    public void testAnInvalidDayFormat() {
        assertFalse(DateTimeChecker.checkDate("one", "2", "2005"));
        assertFalse(DateTimeChecker.checkDate("0.123", "2", "2005"));
    }

    @Test
    public void testAnInvalidMonthFormat() {
        assertFalse(DateTimeChecker.checkDate("1", "two", "2003"));
        assertFalse(DateTimeChecker.checkDate("1", "2.2", "2003"));
    }

    @Test
    public void testAnInvalidYearFormat() {
        assertFalse(DateTimeChecker.checkDate("1", "2", "two thousand and five"));
        assertFalse(DateTimeChecker.checkDate("1", "2", "2.2"));
    }

    // TODO: Anh (10-12)
    @Test
    public void testNegativeDay() {
        assertFalse(DateTimeChecker.checkDate("-10", "1", "2000"));
    }

    @Test
    public void testNegativeMonth() {
        assertFalse(DateTimeChecker.checkDate("1", "-10", "2000"));
    }

    @Test
    public void testNegativeYear() {
        assertFalse(DateTimeChecker.checkDate("1", "1", "-2000"));
    }

    // TODO: Quang (13-15)
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
