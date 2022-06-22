public class LeapYear {

    public static boolean isLeapYear (int year) {

        boolean result = !((year % 4 != 0) | ((year % 100 == 0) & (year % 400 != 0)));

        return result;
    }

}
