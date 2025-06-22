
public class ProxyImage implements Image {
	
	private String fileName;
	private RealImage realImage;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public void Display() {
		if (realImage == null) {
            realImage = new RealImage(fileName); // Lazy initialization
        }
        realImage.Display();
	}

}
