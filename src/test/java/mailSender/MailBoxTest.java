package mailSender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    private MailBox mailBox;
    private Client client;
    private MailInfo mailInfo;

    @BeforeEach
    void setUp() {
        mailBox = new MailBox();
        client = new Client();
        client.setName("Markiian");
        client.setAge(19);
        MailCode mailCode = MailCode.HAPPY_BIRTHDAY;
        mailInfo = new MailInfo(client, mailCode);
        mailBox.addMailInfo(mailInfo);
    }

    @Test
    void addMailInfo() {
        assertEquals(1, mailBox.getInfos().size());
    }

    @Test
    void sendAll() {
        mailBox.addMailInfo(mailInfo);
        String text = "Happy birthday, Markiian!\n" +
                "You are already 19 years old, wish you all the best.";
        mailBox.sendAll();
        assertEquals(text, client.getMail());
    }
}