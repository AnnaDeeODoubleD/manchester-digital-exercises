import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to convert to Roman Numerals");
        String userInput = input.nextLine();
        int typedInput = Integer.parseInt(userInput);

        String romanResult = RomanNumeralConverter.toRoman(typedInput);
        System.out.println("Roman Numeral: " + romanResult);
    }
}
