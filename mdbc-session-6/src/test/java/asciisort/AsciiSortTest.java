package asciisort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AsciiSortTest {
    AsciiSort runner;

    @BeforeEach
    void setup() {
        this.runner = new AsciiSort();
    }

    @Test
    void shouldReturnCorrectAsciiValueForAGiveString() {
        assertEquals(105, this.runner.getComplexity("i"));
        assertEquals(532, this.runner.getComplexity("hello"));
    }

    @Test
    void shouldReturnBookNamesInComplexityOrder() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("1984");
        expected.add("Moby Dick");
        expected.add("To Kill a Mockingbird");
        expected.add("The Catcher in the Rye");

        String[] unsortedBookArray = {
                "The Catcher in the Rye",
                "To Kill a Mockingbird",
                "1984",
                "Moby Dick"
        };

        assertEquals(expected, this.runner.sortByAscii(unsortedBookArray));
    }

}