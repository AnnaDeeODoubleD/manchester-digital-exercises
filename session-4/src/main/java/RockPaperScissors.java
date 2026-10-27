import java.sql.SQLOutput;
import java.util.Scanner;

public class RockPaperScissors {
    static void main() {
        Scanner input = new Scanner(System.in);
        String userInput = getUserInput(input);


        String computerMove = getComputerMove();
        System.out.println("The computer chose: " + computerMove);


        String gameResult = getGameResult(userInput, computerMove);

        System.out.println(gameResult);
    }

    public static String getGameResult(String userInput, String computerMove) {

        if(userInput.equalsIgnoreCase(computerMove)) {
           return "It's a draw!";

        }else if (userInput.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")){
                return "You Win!";
        }else if (userInput.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper")){
                return "You Win!";
        }else if ((userInput.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock"))){
                return "You Win!";


        }


           return "You Lose!";

    }

    private static String getUserInput(Scanner input) {
        System.out.println("Rock, Paper Or Scissors?");
        String userInput = input.nextLine();
        return userInput;
    }

    private static String getComputerMove() {
        String computerMove = "";
        int computerChoice = (int)(Math.random() * 3) + 1;


        if(computerChoice == 1){
            computerMove = "Rock";
        } else if( computerChoice == 2){
            computerMove = "Paper";
        }else if ( computerChoice == 3){
            computerMove = "Scissors";
        }
        return computerMove;
    }
}
