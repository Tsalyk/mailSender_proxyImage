package mailSender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MailCodeTest {
    private MailCode mailCode;

    @BeforeEach
    void setUp() {
        mailCode = MailCode.HAPPY_BIRTHDAY;
    }

    @Test
    void generateText() {
        String text = "Happy birthday, %NAME%!\n" +
                "You are already %AGE% years old, wish you all the best.";

        assertEquals(text, mailCode.generateText());
    }
}