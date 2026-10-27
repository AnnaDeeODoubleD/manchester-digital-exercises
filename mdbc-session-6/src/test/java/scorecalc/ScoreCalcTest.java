package scorecalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreCalcTest {

    public ScoreCalc runner;

    @BeforeEach
    void setup () {
        this.runner = new ScoreCalc();
    }

    @Test
    @Tag("oneGamesPoints")
    void shouldThrowErrorIfEmptyStringIsPassed() {
        assertThrows(IllegalArgumentException.class, () -> this.runner.oneGamesPoints(""));
    }

    @Test
    @Tag("oneGamesPoints")
    void shouldThrowErrorIfScoreHasLetterInsteadOfNumber() {
        assertThrows(IllegalArgumentException.class, () -> this.runner.oneGamesPoints("a:1"));
        assertThrows(IllegalArgumentException.class, () -> this.runner.oneGamesPoints("1:a"));
        assertThrows(IllegalArgumentException.class, () -> this.runner.oneGamesPoints("a:a"));
    }

    @Test
    @Tag("oneGamesPoints")
    void shouldReturnCorrectPointForEachScore() {
        assertEquals(3, this.runner.oneGamesPoints("2:1"));
        assertEquals(1, this.runner.oneGamesPoints("1:1"));
        assertEquals(0, this.runner.oneGamesPoints("1:2"));
    }

    @Test
    @Tag("seasonHomePoints")
    void shouldReturnCorrectPointTotalForASeason() {
        String[] gameScores = {
                "4:2", "8:0", "1:7", "3:9", "6:1",
                "0:5", "9:4", "2:2", "7:8", "5:3",
                "1:1", "6:9", "0:0", "4:7", "8:3",
                "2:6", "9:1", "3:5", "7:0", "5:8",
                "8:4", "1:2", "6:6", "0:9", "4:1",
                "9:7", "2:0", "7:3", "3:8", "5:5",
                "6:0", "1:9", "8:8", "4:3", "0:2",
                "9:6", "2:5", "7:1"
        };

        int result = 57;
        assertEquals(result, this.runner.seasonHomePoints(gameScores));
    }

}