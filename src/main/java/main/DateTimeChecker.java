package main;



public class DateTimeChecker {

    public static void main(String[] args) {
        String day = "02";
        String month = "09";
        String year = "2023";

        System.out.println(checkDate(day, month, year));
    }

    public static boolean isCorrectFormat(String day, String month, String year) {
        try {
            Integer.parseInt(day);
            Integer.parseInt(month);
            Integer.parseInt(year);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidRange(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1000 || year > 3000) {
            return false;
        }
        return true;
    }

    public static int dayInMonth(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; // Invalid month
        }
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (1 <= month && month <= 12 && 1 <= day && day <= dayInMonth(year, month)) {
            return true;
        }
        return false;
    }

    public static boolean checkDate(String day, String month, String year) {
        if (!isCorrectFormat(day, month, year)) {
            return false;
        }

        int intDay = Integer.parseInt(day);
        int intMonth = Integer.parseInt(month);
        int intYear = Integer.parseInt(year);


        if (isValidRange(intDay, intMonth, intYear) && isValidDate(intDay, intMonth, intYear)) {
            return true;
        } else {
            return false;
        }
    }
}

