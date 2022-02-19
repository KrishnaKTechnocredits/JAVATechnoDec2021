package gauravk.Programs47;
import java.util.Arrays;

/*
 * 11.How to find all pairs in an array of integers whose sum is equal to the given
number
i/p : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}
 */
public class PairsOfIntegersHavingSum {
	
	void pairsHavingSum(int[] array, int target) {
		for(int i=0; i<array.length-1; i++) {
			int x=array[i];
			for(int j=i+1; j<array.length; j++) {
				if(x+array[j]==target)
					System.out.println("{"+x+","+array[j]+"}");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,1,2,7,6,3,4,9};
		int sum = 6;
		PairsOfIntegersHavingSum pairs = new PairsOfIntegersHavingSum();
		pairs.pairsHavingSum(arr, sum);
	}
}
