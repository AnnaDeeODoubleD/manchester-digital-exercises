package currecyconverter;

import java.util.Scanner;

public class Main {
    static void main() {
        while (true) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("What currency would you like to convert to");
                String currencyCode = scanner.nextLine();

                System.out.println("How much would you like to convert");
                String rawAmount = scanner.nextLine();
                double amount = Double.parseDouble(rawAmount);

                CurrencyConvert converter = new CurrencyConvert();
                System.out.println(converter.convertMoney(currencyCode, amount));

                System.out.println("would you like to leave");
                String leave = scanner.nextLine();
                if (leave.equalsIgnoreCase("yes")) break; else continue;
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
            break;
        }
    }
}
