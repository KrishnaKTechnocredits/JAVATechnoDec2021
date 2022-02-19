package gauravk.Programs47;
import java.util.Arrays;
import java.util.TreeSet;

/*
 * 13.How to find the largest and smallest number in an array
i/p : {5,1,2,7,6,3,4,9}
o/p : small: 1 & highest: 9
 */
public class SmallestAndLargestNumFrmArray {
	
	String smallestAndLargestNum(int[] arr) {
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i : arr) {
			ts.add(i);
		}
		return "Smallest: "+ts.first()+" and Largest: "+ts.last();
	}
	
	public static void main(String[] args) {
		int[] input = {5,1,2,7,6,3,4,9};
		SmallestAndLargestNumFrmArray sln = new SmallestAndLargestNumFrmArray();
		System.out.println("From an array "+Arrays.toString(input)+" "+sln.smallestAndLargestNum(input));
	}
}
