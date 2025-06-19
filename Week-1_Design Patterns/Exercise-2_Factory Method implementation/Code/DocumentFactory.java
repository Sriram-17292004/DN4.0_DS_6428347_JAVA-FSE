
public class DocumentFactory {
	public Document createDocument(String type) {
		if(type == null || type.isEmpty()) {
			throw new IllegalArgumentException("Doc type cannot be null or empty");
		}
		switch(type.toLowerCase()){
			case "word":
				return new WordDocument();
			case "pdf":
				return new PdfDocument();
			case "excel":
				return new ExcelDocument();
			default:
				throw new IllegalArgumentException("Unknown document type: " + type);
		}
		
	}
}
