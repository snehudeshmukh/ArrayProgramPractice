
public class ArrayPrintPattern {
public static void main(String[] args) {
	int c1[]={1,1,1,1,1,1,1,1,1};
	for(int i=0;i<c1.length;i++) {
		System.out.println("");
		for(int j=1;j<c1.length-1;j++) {
			System.out.print("-");
		}
	}
	
}
}
