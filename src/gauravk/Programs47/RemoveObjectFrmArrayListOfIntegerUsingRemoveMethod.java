package gauravk.Programs47;
import java.util.ArrayList;

/*
 * 47. Write a program to remove Object from the ArrayList of Integer (using
remove(Object obj) method)
 */
public class RemoveObjectFrmArrayListOfIntegerUsingRemoveMethod {
	public static void main(String[] args) {
		int[] nums =  {23, 4, 7, 45, 41, 43, 27, 12, 59, 89, 67, 71, 73, 34, 83, 90, 96};
		ArrayList<Integer> arl = new ArrayList<>();
		for(int x : nums) {
			arl.add(x);
		}
		System.out.println(new RemoveObjectFrmArrayListOfIntegerUsingRemoveMethod().getClass().getSimpleName());
		System.out.println(arl);
		System.out.println("removig value '27' from ArrayList.");
		arl.remove(new Integer(27));
		System.out.println(arl);
	}
}
