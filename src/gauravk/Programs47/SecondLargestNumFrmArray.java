package gauravk.Programs47;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/*
 * 36. Find the second largest number from Given Array.
i/p : {15,16,52,89,93,20,87,42}
o/p : 87
Hint: Convert Array -> TreeSet -> ArrayList
 */
public class SecondLargestNumFrmArray {
	
	int findSecondLargeNumV1(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-2];
	}
	
	int findSecondLargeNumV2(int[] arr) {
		TreeSet<Integer> ts = new TreeSet<>();
		for(int x : arr) {
			ts.add(x);
		}
		ArrayList<Integer> arl = new ArrayList<>(ts);
		return arl.remove(arl.size()-2);
	}
	
	public static void main(String[] args) {
		int[] num1 = {15,16,52,89,93,20,87,42};
		SecondLargestNumFrmArray secondLarge = new SecondLargestNumFrmArray();
		System.out.println("*******using normal Arrys.sort() method*******");
		System.out.println("Second largest number from the given Array: "+Arrays.toString(num1)+"\nOutput: "+secondLarge.findSecondLargeNumV1(num1)+"\n");
		int[] num2 = {15,16,52,89,93,20,87,42};
		System.out.println("*******using TreeSet and then Arraylist*******");
		System.out.println("Second largest number from the given Array: "+Arrays.toString(num2)+"\nOutput: "+secondLarge.findSecondLargeNumV2(num2));
	}
}
