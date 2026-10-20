import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLetterTest {

    @Test
    void testReverseLetter() {
        String expected = "t@eb eht av$J!123";
        String input = "J@va the be$t!123";
        String actual = ReverseLetter.reverseLetters(input);
        assertEquals(expected, actual);
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expected = "";
        String actual = ReverseLetter.reverseLetters(input);
        assertEquals(expected,actual);
    }

    @Test
    void testSingleLetter() {
        String expected = "a";
        String input = "a";
        String actual = ReverseLetter.reverseLetters(input);
        assertEquals(expected,actual);
    }

    @Test
    void testNoLetters() {
        String expected = "123 !@#";
        String input = "123 !@#";
        String actual = ReverseLetter.reverseLetters(input);
        assertEquals(expected,actual);
    }

    @Test
    void testOnlyLetters() {
        String input = "abcd";
        String expected = "dcba";
        String actual = ReverseLetter.reverseLetters(input);
        assertEquals(expected,actual);
    }

    @Test
    void testSpecialCharacters() {
        String input = "!ab@cd#";
        String expected = "!dc@ba#";
        String actual = ReverseLetter.reverseLetters(input);
        assertEquals(expected, actual);
    }

    @Test
    void testUpperLowerCase() {
        String input = "AbCd";
        String expected = "dCbA";
        String actual = ReverseLetter.reverseLetters(input);
        assertEquals(expected, actual);
    }

    @Test
    void testNull() {
        String expected = "";
        String actual = ReverseLetter.reverseLetters(null);
        assertEquals(expected, actual);
    }
}
