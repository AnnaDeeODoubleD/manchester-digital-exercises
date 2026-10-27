import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {

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
}