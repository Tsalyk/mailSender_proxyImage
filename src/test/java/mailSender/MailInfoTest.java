package mailSender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    private MailInfo mailInfo;

    @BeforeEach
    void setUp() {
        Client client = new Client();
        client.setName("Markiian");
        client.setAge(19);
        MailCode mailCode = MailCode.HAPPY_BIRTHDAY;
        mailInfo = new MailInfo(client, mailCode);
    }

    @Test
    void getMailText() {
        String text = "Happy birthday, Markiian!\n" +
                "You are already 19 years old, wish you all the best.";
        assertEquals(text, mailInfo.getMailText());
    }
}