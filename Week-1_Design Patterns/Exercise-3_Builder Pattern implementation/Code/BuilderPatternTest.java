
public class BuilderPatternTest {

	public static void main(String[] args) {
		
		Computer comp1 = new Computer.Builder()
				.setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .build();
		
		Computer comp2 = new Computer.Builder()
                .setCPU("AMD Ryzen 7")
                .setRAM("16GB")
                .setStorage("1TB HDD")
                .build();
		
		 System.out.println(comp1.toString());
	     System.out.println(comp2.toString());

	}

}
