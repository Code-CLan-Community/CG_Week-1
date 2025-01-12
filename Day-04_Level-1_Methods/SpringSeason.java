import java.util.Scanner;
public class SpringSeason {
    // Method to check if the given date is in spring season
    boolean isSpringSeason(int day, int month) {
        // Check if the date is in spring season
        return (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 20);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = scanner.nextInt();
        System.out.println("Enter the month: ");
        int month = scanner.nextInt();
        SpringSeason springSeason = new SpringSeason();
        // Display the result
        System.out.println(springSeason.isSpringSeason(day, month));

    }
}
