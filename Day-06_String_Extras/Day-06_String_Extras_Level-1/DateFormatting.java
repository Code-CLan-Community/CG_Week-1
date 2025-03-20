import java.time.*;
import java.time.format.*;
import java.util.*;

public class DateFormatting {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        // Create a DateTimeFormatter object with the desired pattern
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy", Locale.ENGLISH);
        // Format the date using the formatter
        String formattedDate1 = currentDate.format(formatter1);
        String formattedDate2 = currentDate.format(formatter2);
        String formattedDate3 = currentDate.format(formatter3);
        // Print the formatted dates
        System.out.println("Formatted Date (dd/MM/yyyy): " + formattedDate1);
        System.out.println("Formatted Date (yyyy-MM-dd): " + formattedDate2);
        System.out.println("Formatted Date (EEE, MMM dd, yyyy): " + formattedDate3
        );
    }
}