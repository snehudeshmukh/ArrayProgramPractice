import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
public static void main(String[] args) {
	ArrayList<String> l1=new ArrayList();
	l1.add("AAA");
	l1.add("BBB");
	l1.add("CCC");
	String[] a1=new String[l1.size()];
	l1.toArray(a1);
	System.out.println(Arrays.toString(a1));
}
}
