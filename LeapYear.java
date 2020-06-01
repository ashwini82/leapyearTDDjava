public class LeapYear {
    /*
     * public static checkLength(String year) { Boolean isLength = true; if
     * (year.length() == 0) { throw new RuntimeException("Check Exception error.");
     * return isLength = false; } if (year.length() > 4) { throw new
     * RuntimeException("Check length of year"); }
     */

    public boolean checkLeapYear(int year) {
        if ((year % 400 == 0) && (year % 100 == 0)) {
            return true;
        } else if (isDivisibleBy4(year)) {
            return true;
        } else {
            return false;
        }
    }

    boolean isDivisibleBy4(int year) {
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

}
