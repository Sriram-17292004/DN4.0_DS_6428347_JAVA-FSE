
public class PdfDocument implements Document {

	@Override
	public void open() {
		System.out.println("Pdf document opened");
	}

	@Override
	public void save() {
		System.out.println("Pdf document saved");
	}

	@Override
	public void close() {
		System.out.println("Pdf document closed");
	}

}
