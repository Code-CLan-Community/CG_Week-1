import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataArthmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date in the format yyyy-MM-dd: ");
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println("Date: " + localDate);
        System.out.println("Date after adding 7 days: " + localDate.plusDays(7));
        System.out.println("Date after adding 1 month: " + localDate.plusMonths(1));
        System.out.println("Date after adding 2 years: " + localDate.plusYears(2));
        System.out.println("Date after subtracting 3 weeks: " + localDate.minusWeeks(3));
        scanner.close();
    }
}