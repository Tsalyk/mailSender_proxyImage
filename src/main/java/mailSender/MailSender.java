package mailSender;


public class MailSender {

    public void sendMail(MailInfo mailInfo) {
        mailInfo.getClient().setMail(mailInfo.getMailText());
    }
}
