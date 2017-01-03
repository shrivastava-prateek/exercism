import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PangramsTest {


    @Test
    public void sentenceEmpty() {
        assertFalse(Pangrams.isPangram(""));
    }

   
    @Test
    public void pangramWithOnlyLowerCase() {
        assertTrue(Pangrams.isPangram("the quick brown fox jumps over the lazy dog"));
    }

   
    @Test
    public void missingCharacterX() {
        assertFalse(Pangrams.isPangram("a quick movement of the enemy will jeopardize five gunboats"));
    }

   
    @Test
    public void anotherMissingCharacterX() {
        assertFalse(Pangrams.isPangram("the quick brown fish jumps over the lazy dog"));
    }

   
    @Test
    public void pangramWithUnderscores() {
        assertTrue(Pangrams.isPangram("\"the_quick_brown_fox_jumps_over_the_lazy_dog\""));
    }

   
    @Test
    public void pangramWithNumbers() {
        assertTrue(Pangrams.isPangram("\"the 1 quick brown fox jumps over the 2 lazy dogs\""));
    }

   
    @Test
    public void missingLettersReplacedByNumbers() {
        assertFalse(Pangrams.isPangram("\"7h3 qu1ck brown fox jumps ov3r 7h3 lazy dog\""));
    }

  
    @Test
    public void pangramWithMixedCaseAndPunctuation() {
        assertTrue(Pangrams.isPangram("\"Five quacking Zephyrs jolt my wax bed.\""));
    }

  
    @Test
    public void pangramWithNonAsciiCharacters() {
        assertTrue(Pangrams.isPangram("Victor jagt zwÃ¶lf BoxkÃ¤mpfer quer Ã¼ber den groÃŸen Sylter Deich."));
    }


  
    @Test
    public void panagramInAlphabetOtherThanAscii() {
        assertFalse(Pangrams.isPangram("Ð¨Ð¸Ñ€Ð¾ÐºÐ°Ñ� Ñ�Ð»ÐµÐºÑ‚Ñ€Ð¸Ñ„Ð¸ÐºÐ°Ñ†Ð¸Ñ� ÑŽÐ¶Ð½Ñ‹Ñ… Ð³ÑƒÐ±ÐµÑ€Ð½Ð¸Ð¹ Ð´Ð°Ñ�Ñ‚ Ð¼Ð¾Ñ‰Ð½Ñ‹Ð¹ Ñ‚Ð¾Ð»Ñ‡Ð¾Ðº Ð¿Ð¾Ð´ÑŠÑ‘Ð¼Ñƒ Ñ�ÐµÐ»ÑŒÑ�ÐºÐ¾Ð³Ð¾ Ñ…Ð¾Ð·Ñ�Ð¹Ñ�Ñ‚Ð²Ð°."));
    }
}
