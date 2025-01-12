import java.util.Random;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] salaryData = generateSalaryAndService(numEmployees);
        double[][] updatedSalaryData = calculateBonusAndNewSalary(salaryData, numEmployees);
        displaySalaryData(salaryData, updatedSalaryData, numEmployees);
    }

    // Generate random salary (between 20000 to 99999) and years of service (0 to 10)
    public static double[][] generateSalaryAndService(int numEmployees) {
        Random random = new Random();
        double[][] data = new double[numEmployees][2]; // [salary, years of service]

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 20000 + random.nextInt(80000); // Salary between 20000 and 99999
            data[i][1] = random.nextInt(11); // Years of service between 0 and 10
        }
        return data;
    }

    // Calculate new salary and bonus based on service years
    public static double[][] calculateBonusAndNewSalary(double[][] salaryData, int numEmployees) {
        double[][] updatedData = new double[numEmployees][2]; // [new salary, bonus amount]

        for (int i = 0; i < numEmployees; i++) {
            double salary = salaryData[i][0];
            double years = salaryData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;

            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonusAmount;
        }
        return updatedData;
    }

    // Display results in tabular format
    public static void displaySalaryData(double[][] oldData, double[][] newData, int numEmployees) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-10s %-12s %-10s %-12s %-12s\n", "Emp ID", "Old Salary", "Years", "New Salary", "Bonus Amount");
        System.out.println("---------------------------------------------------------------------------");

        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("%-10d %-12.2f %-10.0f %-12.2f %-12.2f\n",
                    (i + 1), oldData[i][0], oldData[i][1], newData[i][0], newData[i][1]);

            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-10s %-12.2f %-12.2f\n",
                "TOTAL", totalOldSalary, "", totalNewSalary, totalBonus);
        System.out.println("---------------------------------------------------------------------------");
    }
}
