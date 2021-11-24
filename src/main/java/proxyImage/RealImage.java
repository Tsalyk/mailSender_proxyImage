package proxyImage;

import lombok.Getter;

@Getter
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("Image displayed");
    }

    public void loadFromDisk() {
        System.out.println("Loading from disk...");
    }
}
