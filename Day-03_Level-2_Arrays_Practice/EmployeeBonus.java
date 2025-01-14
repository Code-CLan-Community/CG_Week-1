import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        // Initialize the total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        int i = 0;
        while (i < 10) {
            System.out.println("Enter the salary of employee " + (i + 1) + 
            ": ");
            salary[i] = scanner.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("Invalid salary. Please enter again.");
                continue;
            }
            System.out.println("Enter the years of service of employee " + (i + 1) + ": ");
            years[i] = scanner.nextDouble();
            if (years[i] <= 0) {
                System.out.println("Invalid years of service. Please enter again.");
                continue;
            }
            i++;
            }
            i = 0;
            while (i < 10) {
                if (years[i] > 5) {
                    // Calculate the bonus for the employee whose years of service is greater than 5
                    bonus[i] = salary[i] * 0.05;
                } else {
                    // Calculate the bonus for the employee whose years of service is less than or equal to 2
                    bonus[i] = salary[i] * 0.02;
                }
                // Calculate the new salary of the employee
                newSalary[i] = salary[i] + bonus[i];
                totalBonus += bonus[i];// Calculate the total bonus payout
                totalOldSalary += salary[i];// Calculate the total old salary
                // Calculate the total new salary
                totalNewSalary += newSalary[i];
                i++;
            }
            System.out.println("Total bonus payout: " + totalBonus);
            System.out.println("Total old salary: " + totalOldSalary);
            System.out.println("Total new salary: " + totalNewSalary);
        }
    }