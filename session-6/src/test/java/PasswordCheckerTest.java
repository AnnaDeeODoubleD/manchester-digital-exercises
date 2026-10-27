import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {
@Test
    void checkBlankPasswordReturnsFalse(){
    //Arrange
    PasswordChecker checker = new PasswordChecker();

    boolean result = checker.checkPassword("");
    //Assert
    assertFalse(result);
}

@Test
    void checkShorterPasswordFails(){
    //Arrange
    PaswordChecker checker = new PasswordChecker();

    }
}
