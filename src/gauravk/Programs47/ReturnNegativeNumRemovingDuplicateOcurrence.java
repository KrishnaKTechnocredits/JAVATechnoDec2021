package gauravk.Programs47;
import java.util.Arrays;
import java.util.LinkedList;

/*
 * 38. Return all negative numbers (remove duplicates if any and maintain insertion
order) from the given array.
i/p : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
o/p : [-11, -19, -99]
Hint: parameter - Array, return type - LinkedList
 */
public class ReturnNegativeNumRemovingDuplicateOcurrence {
	
	LinkedList<Integer> negativeNumRemovingDuplicateOcurrence(int[] arr){
		LinkedList<Integer> llst = new LinkedList<>();
		for(int x : arr) {
			if(!llst.contains(x) && x<0) {
				llst.add(x);
			}
		}
		return llst;
	}
	
	public static void main(String[] args) {
		int [] num = {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		ReturnNegativeNumRemovingDuplicateOcurrence negNum = new ReturnNegativeNumRemovingDuplicateOcurrence();
		System.out.println("Return all negative numbers (remove duplicates if any and maintain insertion order) from the given array.\nInput: "+Arrays.toString(num)+"\nOutput: "+negNum.negativeNumRemovingDuplicateOcurrence(num));
	}
}
