package gauravk.Programs47;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 33. Write a program to remove duplicates from ArrayLists (without using set).
i/p : {1,6,2,1,3,0,6,4}
o/o: {1,6,2,3,0,4}
 */
public class RemoveDuplicatesWithoutUsingSet {
	
	ArrayList<Integer> removeDuplicateOcurrenceWithoutUsingSet(int[] arr){
		ArrayList<Integer> arl1 = new ArrayList<>();
		for(int x : arr) {
			if(!arl1.contains(x)) {
				arl1.add(x);
			}
		}
		return arl1;
	}
	
	public static void main(String[] args) {
		int[] input = {1,6,2,1,3,0,6,4};
		System.out.println("After removing duplicate ocurrence of elements from and array without using Set : "+Arrays.toString(input)+"\nOutput : "+new RemoveDuplicatesWithoutUsingSet().removeDuplicateOcurrenceWithoutUsingSet(input));
	}
}
