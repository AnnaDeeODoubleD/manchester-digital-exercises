import java.util.Scanner;

public class Main {


    static void main() {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number");
        String userInput = input.nextLine();
        int someNumber = Integer.parseInt(userInput);

        int result = calc.addFive(someNumber);
        System.out.println(result);
    }


}
