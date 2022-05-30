
public class AAA {
public static void main(String[] args) {
	try {
		int a=30;
		int div=30/0;
	}
	
	catch(RuntimeException e) {
		System.out.println("Runtime Exception");
		
		
	}
//	catch(ArithmeticException e) {
//		System.out.println("Arithmetic Exception");
//	}
}
}
