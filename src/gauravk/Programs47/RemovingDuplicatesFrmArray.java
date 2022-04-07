package gauravk.Programs47;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 12.How to remove duplicate elements from the array in Java?
i/p : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}
 */
public class RemovingDuplicatesFrmArray {
	
	ArrayList<Integer> removingDuplicates(int[] arr){
		ArrayList<Integer> arl = new ArrayList<>();
		for(int i=0; i<arr.length-1; i++) {
			int x = arr[i];
			int count=0;
			for(int j=i+1; j<arr.length; j++) {
				if(x==arr[j])
					count++;
			}
			if(count==0) {
				arl.add(x);
			}
		}
		return arl;
	}
	
	public static void main(String[] args) {
		int[] input = {5,8,1,2,4,3,2,1};
		RemovingDuplicatesFrmArray rd = new RemovingDuplicatesFrmArray();
		System.out.println("After removing duplicates from array "+Arrays.toString(input)+"\nOutput: "+rd.removingDuplicates(input));
	}
}
