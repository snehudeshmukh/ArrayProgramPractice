
public class SumOfArray {
public static void main(String[] args) {
	int [] a1 = {5,9,12,6,18,23,2};
	int sum=0;
	for(int i=0;i<a1.length;i++) {
		sum+=a1[i];
	}
	System.out.println("Sum of Array is"+sum);
	int res=sum/a1.length;
	System.out.println("Average of Array is:"+res);
}
}
