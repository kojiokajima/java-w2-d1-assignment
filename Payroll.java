import java.util.Scanner;
import java.lang.Math;

public class Payroll {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours: ");
        int hours = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double grossPay = hours * payRate;
        // double federalWithholding = grossPay * federalTax;
        double federalWithholding = Math.round(grossPay * federalTax * 100.0) / 100.0;
        // double statelWithholding = grossPay * stateTax;
        double statelWithholding = Math.round(grossPay * stateTax * 100.0) / 100.0;
        double netPay = grossPay - federalWithholding - statelWithholding;


        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (" + federalTax * 100 + "%): $" + federalWithholding);
        System.out.println("  State Withholding (" + stateTax * 100 + "%): $" + statelWithholding);
        System.out.println("Net Pay: $" + netPay);


        

    }
}