import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class CalculatorTest {

        @Test

        public void divideShouldReturnCorrectResult() {
            Calculator calc = new Calculator();
            assertEquals(2, calc.divide(10, 5));

        }


        @Test

        public void divideShouldThrowWhenDividingByZero() {
        Calculator calc = new Calculator();
            assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 1));

        }

    }
