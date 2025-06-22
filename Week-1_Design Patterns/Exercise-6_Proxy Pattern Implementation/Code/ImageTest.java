public class ImageTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("pic1.jpg");
        Image image2 = new ProxyImage("pic2.jpg");

        // Image is loaded and displayed
        image1.Display();

        // Image is already cached, no need to load again
        image1.Display();

        // Load and display new image
        image2.Display();
    }
}
