
public class singletonTest {

	public static void main(String[] args) {
		
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		Logger logger3 = Logger.getInstance();
		
		logger1.display("Hello");
		logger2.display("Namsthey");
		logger3.display("Aadhaab");
		
		if(logger1 == logger2) {
			if(logger2 == logger3) {
				logger1.display("Only one logger instance is used");
			}
		}
		else {
			logger1.display("Multiple logger instances are used");
		}
	}

}
