import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class RomanNumeralConverterTest {

        @Test

        void testNumberFifteenIsXv(){
            //Arrange
            int number = 15;
            String expectedSymbol = "XV";

            //Act
            String romanNumeral = RomanNumeralConverter.toRoman(number);

            //Assert
            assertEquals(expectedSymbol, romanNumeral);
        }

        @Test

        void testNumberOneIsI(){

            //Arrange
            int number = 1;
            String expectedSymbol = "I";

            //Act
            String romanNumeral = RomanNumeralConverter.toRoman(number);

            //Assert
            assertEquals(expectedSymbol, romanNumeral);
        }

        @Test

        void testNumberTenIsX(){

            //Arrange
            int number = 10;
            String expectedSymbol = "X";

            //Act
            String romanNumeral = RomanNumeralConverter.toRoman(number);

            //Assert
            assertEquals(expectedSymbol, romanNumeral);
        }
    }
