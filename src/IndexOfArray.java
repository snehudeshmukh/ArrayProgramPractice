
public class IndexOfArray {
public static void main(String[] args) {
	int a1[]= {23,5,18,3,9,10,14,55};
			int element=1;
			int i=0;
			int index=-1;
			while(i<a1.length) {//for loop(int i=0;i<a1.length;i++)
				if(a1[i]==element) {
					index=i;
					break;
				}
				i++;
			}
System.out.println("Index of"+element+" is: "+index);
}
}
