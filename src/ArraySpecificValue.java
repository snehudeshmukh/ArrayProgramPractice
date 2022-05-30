
public class ArraySpecificValue {
public static void main(String[] args) {
	int a2[]= {3,6,18,19,34,5,13,55};
	System.out.println(contains(a2));
}
	static boolean contains(int []arr) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==55) {
			return true;
	}
	}
	return false;
	}
}
	


