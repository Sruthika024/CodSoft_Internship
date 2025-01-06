 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency_converter;

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class Currency_converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Currency Converter.");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the amount in USD:");
            double USD = scanner.nextDouble();
            double convertedAmount = usdToRupee(USD);
            System.out.println("Converted amount in Rupee: " + convertedAmount);
        } else if (choice == 2) {
            System.out.println("Enter the amount in Rupee:");
            double rupee = scanner.nextDouble();
            double convertedAmount = rupeeToUsd(rupee);
            System.out.println("Converted amount in USD: " + convertedAmount);
        } else if (choice == 3) {
            System.out.println("Enter the amount in Euro:");
            double Euro = scanner.nextDouble();
            double convertedAmount = euroToRupee(Euro);
            System.out.println("Converted amount in Rupee: " + convertedAmount);
        } else if (choice == 4) {
            System.out.println("Enter the amount in Rupee:");
            double rupee = scanner.nextDouble();
            double convertedAmount = rupeeToEuro(rupee);
            System.out.println("Converted amount in Euro: " + convertedAmount);
        } else {
            System.out.println("Invalid Choice. Please select 1, 2, 3, or 4.");
        }
        scanner.close();
    }

    public static double usdToRupee(double USD) {
        return USD * 83.47;
    }

    public static double rupeeToUsd(double rupee) {
        return rupee * 0.01198;
    }

    public static double euroToRupee(double Euro) {
        return Euro * 89.10;
    }

    public static double rupeeToEuro(double rupee) {
        return rupee * 0.0113;
    }
}