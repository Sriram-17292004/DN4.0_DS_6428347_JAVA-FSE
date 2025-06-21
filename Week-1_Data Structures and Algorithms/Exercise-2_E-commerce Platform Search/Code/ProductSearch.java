import java.util.*;

public class ProductSearch{
	
	public static int linearSearch(Product products[], int targetId) {
		
		for(int i = 0; i < products.length; i++) {
			if(products[i].getProductId() == targetId) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static int binarySearch(Product products[], int targetId) {
		int left = 0;
		int right = products.length;
		int mid = 0;
		while(left <= right) {
			mid = (left + right)/2;
			if(products[mid].getProductId() == targetId) {
				return mid;
			}
			else if(products[mid].getProductId() < targetId) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public static void sortByProductId(Product[] products) {
		Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
	}
	
}
