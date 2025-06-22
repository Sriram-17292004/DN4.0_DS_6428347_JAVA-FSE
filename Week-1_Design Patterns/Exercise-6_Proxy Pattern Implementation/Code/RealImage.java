
public class RealImage implements Image {
	
	private String fileName;
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadImage(fileName);
	}
	
	private void loadImage(String fileName) {
		System.out.println("loading Image from Server: "+fileName);
	}
	
	@Override
	public void Display() {
		System.out.println("Displaying Image: "+fileName);
	}

}
