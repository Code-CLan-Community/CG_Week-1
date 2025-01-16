import java.util.Scanner;

public class DisplayTheCalender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month and year (MM YYYY): ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();
        displayCalendar(month, year);
        }
        public static void displayCalendar(int month, int year) {
            String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            int[] daysInMonth = {31, 28, 31, 30,
            31, 30, 31, 31, 30, 31, 30, 31};
            if (isLeapYear(year)) {
            daysInMonth[1] = 29;
            }
            int firstDay = getFirstDay(month, year);
            System.out.println("\t" + monthNames[month - 1] + " " + year);
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
            for (int i = 0; i < firstDay; i++) {
            System.out.print("\t");
            }
            for (int i = 1; i <= daysInMonth[month - 1]; i++) {
            System.out.printf("%3d\t", i);
            if ((i + firstDay) % 7 == 0) {
            System.out.println();
            }
            }
            }
            public static boolean isLeapYear(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
            }
            return false;
            }
            public static int getFirstDay(int month, int year) {
            int y0 = year - (14 - month) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = month + 12 * ((14 - month) / 12) - 2;
            int d0 = (1 + x + 31 * m0 / 12) % 7;
            return d0;
            }

}