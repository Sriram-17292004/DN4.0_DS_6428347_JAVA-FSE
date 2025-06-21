
public class eCommercePlatformSearchTest {

	public static void main(String[] args) {
		Product[] catalog = {
	            new Product(103, "USB‑C Cable",        "Accessories"),
	            new Product(101, "Mechanical Keyboard","Peripherals"),
	            new Product(105, "Gaming Mouse",       "Peripherals"),
	            new Product(102, "27‑inch Monitor",    "Displays"),
	            new Product(104, "Laptop Stand",       "Accessories")
	        };
		int targetId = 104;
		
		int LSres = ProductSearch.linearSearch(catalog, targetId);
		System.out.println("Linear Search " + (LSres != -1 ? catalog[LSres].toString() : "Not found"));
		
		ProductSearch.sortByProductId(catalog);
		int BSres = ProductSearch.binarySearch(catalog, targetId);
		System.out.println("Binary Search " + (BSres != -1 ? catalog[BSres].toString() : "Not found"));
	}

}
