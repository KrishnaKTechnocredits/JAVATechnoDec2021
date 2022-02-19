package gauravk.Programs47;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 43. Write a program to traverse (or iterate) ArrayList using enhanced for loop and
iterator.
44. Write a program to convert Array to List.
45. Write a program to traverse(or iterate) HashSet.
46. Write a program to add elements at a particular index of ArrayList?
 */
public class IteratingArrayListUsingIterator {
	
	void traversingArrayListUsingItratorAndEnhanceForLoop(int[] arr) {
		ArrayList<Integer> arl = new ArrayList<>();
		for(int x : arr) {
			arl.add(x);
		}
		System.out.println("\nMethod used: "+new Object(){}.getClass().getEnclosingMethod().getName());
		Iterator<Integer> i = arl.iterator();
		for(int z : arl) {
			if(i.hasNext()) {
				
				System.out.println(i.next());
			}
			
		}
	}
	
	void traverseHashSet(int[] arr) {
		System.out.println("\nMethod used: "+new Object(){}.getClass().getEnclosingMethod().getName());
		HashSet<Integer> hs = new HashSet<>();
		for(int z : arr) {
			hs.add(z);
		}
		System.out.println(hs);
		Iterator<Integer> i = hs.iterator();
		for(Integer x : hs) {
			if(i.hasNext()) {
				System.out.println(i.next());
			}
		}
	}
	
	void addElementInArrayListAtNthIndex(int[] arr, int position, int target) {
		System.out.println("\nMethod used: "+new Object(){}.getClass().getEnclosingMethod().getName());
		ArrayList<Integer> arl = new ArrayList<>();
		for(int i : arr) {
			arl.add(i);
		}
		System.out.println(arl.size());
		try{
			arl.add(position, target);
		} catch (IndexOutOfBoundsException indexE) {
			System.out.println("position of insertion "+position+" is outside the size of list."+arl.size());
		} finally {
		System.out.println(arl);
		}
	}
	
	public static void main(String[] args) {
		int[] nums =  {23, 4, 7, 45, 41, 43, 27, 12, 59, 89, 67, 71, 73, 34, 83, 90, 96}
;
		IteratingArrayListUsingIterator itr = new IteratingArrayListUsingIterator();
		itr.traversingArrayListUsingItratorAndEnhanceForLoop(nums);
		itr.traverseHashSet(nums);
		itr.addElementInArrayListAtNthIndex(nums, 3, 500);
		itr.addElementInArrayListAtNthIndex(nums, 17, 500);
		itr.addElementInArrayListAtNthIndex(nums, 18, 500);
	}
}
