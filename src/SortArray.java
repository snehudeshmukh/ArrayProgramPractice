
public class SortArray {
public static void main(String[] args) {
	int[]arr= {4,7,2,8,5,10};
	
	for(int i=0;i<arr.length;i++) {
		for(int j=1;j<arr.length-1;j++) {
			if(arr[i]>arr[j]) {
				arr[j]=arr[i];
			}
			System.out.println(arr[j]);
		}
		
	}
}
}
