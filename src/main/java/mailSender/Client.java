package mailSender;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String mail;

    public Client() {
        id = ClientIdGenerator.generateId();
    }

    public static class ClientIdGenerator {
        private static int counter = 0;

        public static int generateId() {
            counter++;
            return  counter;
        }
    }
}
