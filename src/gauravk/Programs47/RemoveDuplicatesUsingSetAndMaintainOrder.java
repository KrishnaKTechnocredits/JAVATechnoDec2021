package gauravk.Programs47;
import java.util.Arrays;
import java.util.LinkedHashSet;

/*
 * 34. Make a program that removes duplicates from an ArrayList using Sets, but
maintains the order.
i/p : {1,6,2,1,3,0,6,4}
o/o: {1,6,2,3,0,4}
 */
public class RemoveDuplicatesUsingSetAndMaintainOrder {
	
	LinkedHashSet<Integer> removeDuplicateOcurrenceUsingSetMaintainOrder(int[] arr){
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		for(int x : arr) {
			lhs.add(x);
		}
		return lhs;
	}
	
	public static void main(String[] args) {
		int[] input = {1,6,2,1,3,0,6,4};
		System.out.println("After removing duplicate ocurrence of elements from and array using Set but maintaining order : "+Arrays.toString(input)+"\nOutput : "+new RemoveDuplicatesUsingSetAndMaintainOrder().removeDuplicateOcurrenceUsingSetMaintainOrder(input));
	}
}
