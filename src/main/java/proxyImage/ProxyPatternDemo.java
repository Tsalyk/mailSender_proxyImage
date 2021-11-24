package proxyImage;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        RealImage realImage = new RealImage("image.png");
        ProxyImage proxyImage = new ProxyImage(realImage, realImage.getFileName());
        proxyImage.display();
    }
}
