package mailSender;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        String text = "";

        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();

        File file = new File(s);
        Scanner sc = new Scanner(file + "/src/main/java/mailSender/" + filename);

        while (sc.hasNextLine()) {
            text += sc.nextLine();
        }

        String content = null;

        try {
            content = new String(Files.readAllBytes(Paths.get(text)));
        } catch (IOException ex) {
            System.out.println("Such template is absent");
        }

        return content;
    }
}
