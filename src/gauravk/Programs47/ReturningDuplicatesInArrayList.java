package gauravk.Programs47;
import java.util.ArrayList;

/*
 * 32. Find out if a given number occurs more than once in an arrayList.
i/p : {1,6,2,9,3,10,62,49,3,13,2,12,93,3}, number to check : 3
o/p : multiple occurrences in Array List.

 */
public class ReturningDuplicatesInArrayList {
	
	void duplicatesInArrayList(int[] arr, int target){
		ArrayList<Integer> arl = new ArrayList<>();
		for(int a : arr) {
			arl.add(a);
		}
		int count=0;
		for(Integer x : arl) {
			if(x==target) {
				count++;
			}
		}
		System.out.println("number "+target+" ocurred "+count+" times.");
	}
	
	public static void main(String[] args) {
		int[] num = {1,6,2,9,3,10,62,49,3,13,2,12,93,3};
		ReturningDuplicatesInArrayList occur = new ReturningDuplicatesInArrayList();
		occur.duplicatesInArrayList(num, 3);
	}
}
