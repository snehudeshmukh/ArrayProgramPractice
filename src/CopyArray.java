import java.util.Arrays;

public class CopyArray {
public static void main(String[] args) {
	int [] a1= {2,3,6,8,9,20,34};
	int []a2=new int[a1.length];
	for(int i=0;i<a1.length;i++) {
		a2[i]=a1[i];
	}
	System.out.println(Arrays.toString(a2));
}
}
