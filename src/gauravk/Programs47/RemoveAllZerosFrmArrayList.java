package gauravk.Programs47;
import java.util.ArrayList;

/*
 * 41. Write a program that removes all zeros from an ArrayList.
i/p : {0,22,35,89,0,16,64,0,82,0,12,0,}
o/p : {22,35,89,16,64,82,12}
 */
public class RemoveAllZerosFrmArrayList {
	
	ArrayList<Integer> removeAllZeros(ArrayList<Integer> alist, int target){
		for(int i=0; i<alist.size(); i++) {
			if(alist.get(i)==target)
				alist.remove(i);
		}
		return alist;
	}
	
	public static void main(String[] args) {
		int[] nums = {0,22,35,89,0,16,64,0,82,0,12,0,};
		int numberToRemove = 0;
		ArrayList<Integer> arl = new ArrayList<>();
		for(int i : nums) {
			arl.add(i);
		}
		System.out.println("After removing all zeros from an ArrayList "+arl+"\nOutput: "+new RemoveAllZerosFrmArrayList().removeAllZeros(arl, numberToRemove));
	}
}
