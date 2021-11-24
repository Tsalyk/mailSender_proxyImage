package mailSender;

import lombok.Getter;
import lombok.Setter;
import java.util.LinkedList;
import java.util.Queue;

@Getter @Setter
public class MailBox {
    private Queue<MailInfo> infos;
    private MailSender sender;

    public MailBox() {
        this.infos = new LinkedList<>();
        this.sender = new MailSender();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        while (! infos.isEmpty()) {
            sender.sendMail(infos.remove());
        }
    }
}
