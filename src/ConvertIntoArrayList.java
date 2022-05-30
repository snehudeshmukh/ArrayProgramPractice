import java.util.ArrayList;
import java.util.Arrays;

public class ConvertIntoArrayList {
public static void main(String[] args) {
	//String []a1= {"AAA","BBB","CCC","DDD"};
	Integer []a1= {1,4,5,7,8,3};
	ArrayList<Integer> l1=new ArrayList(Arrays.asList(a1));
	System.out.println(l1);
}

}
