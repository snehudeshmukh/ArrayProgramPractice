import java.util.Arrays;

public class RemoveZeroFromArray {
public static void main(String[] args) {
	int[]a1= {1,0,4,0,0,6,5,0,9};
	int len=0;
	for(int i=0;i<a1.length;i++) {
		if(a1[i]!=0)
			len++;
	}
	int a2[]=new int[len];
	for(int i=0,j=0;i<a1.length;i++) {
		if(a1[i]!=0) {
			a2[j]=a1[i];
			j++;
		}
	}
	System.out.println(Arrays.toString(a2));
}
}
