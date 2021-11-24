package proxyImage;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(RealImage realImage, String fileName) {
        this.realImage = realImage;
        this.fileName = fileName;
    }

    public void display() {
        realImage.display();
    }
}
