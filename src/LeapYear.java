public class LeapYear {

    public static boolean isLeapYear (int year) {

        boolean result = false;

        if ((year % 400 == 0) | ((year % 100 != 0) & (year % 4 == 0))) {

            result = true;

        }

        return result;
    }

}
