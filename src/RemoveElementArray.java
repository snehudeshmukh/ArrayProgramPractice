import java.util.Arrays;

public class RemoveElementArray {
public static void main(String[] args) {
	int arr[]= {12,3,7,8,13,14,9,10};
	int element=13;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==element) {
			arr[i]=0;
		}
	}
		
	System.out.println(Arrays.toString(arr));
	
}
}
