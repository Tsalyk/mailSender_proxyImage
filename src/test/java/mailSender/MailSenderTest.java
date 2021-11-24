package mailSender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailSenderTest {
    private MailSender mailSender;
    private MailInfo mailInfo;
    private Client client;

    @BeforeEach
    void setUp() {
        client = new Client();
        client.setName("Markiian");
        client.setAge(19);
        MailCode mailCode = MailCode.HAPPY_BIRTHDAY;
        mailInfo = new MailInfo(client, mailCode);
        mailSender = new MailSender();
    }

    @Test
    void sendMail() {
        mailSender.sendMail(mailInfo);
        String text = "Happy birthday, Markiian!\n" +
                "You are already 19 years old, wish you all the best.";

        assertEquals(text, client.getMail());
    }
}