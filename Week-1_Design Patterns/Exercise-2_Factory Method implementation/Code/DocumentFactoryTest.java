
public class DocumentFactoryTest {

	public static void main(String[] args) {
		
		DocumentFactory factory = new DocumentFactory();
		
		Document doc1 = factory.createDocument("word");
		doc1.open();
		doc1.save();
		doc1.close();
		
		Document doc2 = factory.createDocument("pdf");
		doc2.open();
		doc2.save();
		doc2.close();
		
		Document doc3 = factory.createDocument("Excel");
		doc3.open();
		doc3.save();
		doc3.close();
		
	}

}
