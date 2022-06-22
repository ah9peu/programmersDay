import java.util.Scanner;

public class ProgrammersDay {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String programmersDay;

        while (true) {
            System.out.println("Введите год (0 - для выхода):");
            int year = scanner.nextInt();

            if (year == 0) {
                System.out.println("Выход");
                break;
            }

            if (LeapYear.isLeapYear(year)) {
                programmersDay = "12.09." + year;
            } else {
                programmersDay = "13.09." + year;
            }

            System.out.println(programmersDay);
        }

    }

}
