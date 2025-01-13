import java.util.Scanner;

// Main program to test the Emolument classes
public class TestProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter Tax Relief: ");
        double taxRelief = scanner.nextDouble();

        // Create a MyEmolument object
        MyEmolument staffSalary = new MyEmolument(basicSalary, taxRelief);

        // Display salary details
        System.out.println("\n--- Staff Salary Details ---");
        System.out.printf("Basic Salary: %.2f%n", staffSalary.getBasicSalary());
        System.out.printf("Tax Relief: %.2f%n", staffSalary.getTaxRelief());
        System.out.printf("SSNIT Contribution: %.2f%n", staffSalary.SSNIT());
        System.out.printf("Taxable Income: %.2f%n", staffSalary.taxableIncome());
        System.out.printf("Income Tax: %.2f%n", staffSalary.incomeTax());
        System.out.printf("Total Deduction: %.2f%n", staffSalary.totalDeduction());
        System.out.printf("Net Salary: %.2f%n", staffSalary.netSalary());

        scanner.close();
    }
}
