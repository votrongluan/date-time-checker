package main;


public class DateTimeChecker {
    public static String message = "";

    public static boolean isCorrectDayFormat(String day) {
        try {
            Integer.parseInt(day);
            return true;
        } catch (NumberFormatException e) {
            message = "Input data for Day is incorrect format!";
            return false;
        }
    }

    public static boolean isCorrectMonthFormat(String month) {
        try {
            Integer.parseInt(month);
            return true;
        } catch (NumberFormatException e) {
            message = "Input data for Month is incorrect format!";
            return false;
        }
    }

    public static boolean isCorrectYearFormat(String year) {
        try {
            Integer.parseInt(year);
            return true;
        } catch (NumberFormatException e) {
            message = "Input data for Year is incorrect format!";
            return false;
        }
    }

    public static boolean isCorrectFormat(String day, String month, String year) {
        return isCorrectDayFormat(day) && isCorrectMonthFormat(month) && isCorrectYearFormat(year);
    }

    public static boolean isValidDayRange(int day) {
        if (day < 1 || day > 31) {
            message = "Input data for Day is out of range!";
            return false;
        }
        return true;
    }

    public static boolean isValidMonthRange(int month) {
        if (month < 1 || month > 12) {
            message = "Input data for Month is out of range!";
            return false;
        }
        return true;
    }

    public static boolean isValidYearRange(int year) {
        if (year < 1000 || year > 3000) {
            message = "Input data for Year is out of range!";
            return false;
        }
        return true;
    }

    public static boolean isValidRange(int day, int month, int year) {
        return isValidDayRange(day) && isValidMonthRange(month) && isValidYearRange(year);
    }

    public static int dayInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
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
        return 1 <= month && month <= 12 && 1 <= day && day <= dayInMonth(year, month);
    }

    public static boolean checkDate(String day, String month, String year) {
        if (!isCorrectFormat(day, month, year)) {
            return false;
        }

        int intDay = Integer.parseInt(day);
        int intMonth = Integer.parseInt(month);
        int intYear = Integer.parseInt(year);

        if (!isValidRange(intDay, intMonth, intYear)) {
            return false;
        }

        if (!isValidDate(intDay, intMonth, intYear)) {
            String formattedDate = String.format("%02d/%02d/%04d", intDay, intMonth, intYear);
            message = formattedDate + " is an incorrect date time!";
            return false;
        } else {
            String formattedDate = String.format("%02d/%02d/%04d", intDay, intMonth, intYear);
            message = formattedDate + " is a correct date time!";
            return true;
        }
    }
}

