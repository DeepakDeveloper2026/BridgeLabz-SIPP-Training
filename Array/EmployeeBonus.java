import java.util.Scanner;

public class Question15_EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] employeeData = new double[10][2]; // salary and years of service
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary. Try again.");
                i--;
                continue;
            }

            System.out.print("Years of Service: ");
            double service = sc.nextDouble();
            if (service < 0) {
                System.out.println("Invalid service years. Try again.");
                i--;
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = service;
        }

        for (int i = 0; i < 10; i++) {
            double bonus = employeeData[i][1] > 5 ? 0.05 * employeeData[i][0] : 0.02 * employeeData[i][0];
            bonuses[i] = bonus;
            newSalaries[i] = employeeData[i][0] + bonus;

            totalBonus += bonus;
            totalOldSalary += employeeData[i][0];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("OldSalary	YearsService	Bonus	NewSalary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f		%.1f		%.2f	%.2f\n", employeeData[i][0], employeeData[i][1], bonuses[i], newSalaries[i]);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f\nTotal Old Salary: %.2f\nTotal New Salary: %.2f\n", totalBonus, totalOldSalary, totalNewSalary);
    }
}