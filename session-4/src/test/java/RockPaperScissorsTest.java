import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {

    @Test
    void testGameResultDraw(){
        String result = RockPaperScissors.getGameResult("Rock", "Rock");
        assertEquals("It's a draw!", result);
    }

    @Test
    void testGameResultWinWithRock(){
        String result = RockPaperScissors.getGameResult("Rock", "Scissors");
        assertEquals("You Win!", result);

    }
    @Test
    void testGameResultWinWithScissors(){
        String result = RockPaperScissors.getGameResult("Scissors", "Paper");
        assertEquals("You Win!", result);
    }

    @Test
    void testGameResultWinWithPaper(){
        String result = RockPaperScissors.getGameResult("Paper", "Rock");
        assertEquals("You Win!", result);
    }

    @Test
    void testGameResultLose(){
        String result = RockPaperScissors.getGameResult("Rock", "Paper");
        assertEquals("You Lose!", result);
    }

    @Test
    void testGameResultCaseSensitivity() {
        String result = RockPaperScissors.getGameResult("rock", "Scissors");
        assertEquals("You Win!", result);
    }

    @Test
    void testInvalidUserInput () {
        String result = RockPaperScissors.getGameResult("egg", "Scissors");
        assertEquals("You Lose!", result);
    }
    @Test
    void testWhiteSpaceUserInput(){
        String result = RockPaperScissors.getGameResult(" Rock ", "Scissors");
        assertEquals("You Win!", result);
    }
}
