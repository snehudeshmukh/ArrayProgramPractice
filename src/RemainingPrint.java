import java.util.Arrays;

public class RemainingPrint {
public static void main(String[] args) {
	int [] arr= {3,4,7,8,9,2};
	int []a1=new int[10];
	int temp=0;
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	for(int i=0;i<=9;i++) {
		int count=0;
		for(int j=0;j<arr.length;j++) {
			if(i==arr[j]) {
				count++;
				a1[temp++]=arr[j];
				continue;
			}
		}
			if(count==0) {
				a1[temp++]=i;
			}
	}
			System.out.println(Arrays.toString(a1));	
			

}
}