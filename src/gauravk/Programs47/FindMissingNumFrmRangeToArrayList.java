package gauravk.Programs47;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 40. Find a missing number in a range [1-10] from given ArrayList.
i/p : {1,6,2,5,7,6,3,10}
o/p : {4,8,9}
Hint: Method Parameter should be ArrayList, return type should be ArrayList.
 */
public class FindMissingNumFrmRangeToArrayList {
	
	ArrayList<Integer> missingNumFrmRangeToArrayList(ArrayList<Integer> alist1, int startNum, int endNum){
		ArrayList<Integer> rangeList = new ArrayList<>();
		for(int i=startNum; i<=endNum; i++) {
			rangeList.add(i);
		}
		rangeList.removeAll(alist1);
		return rangeList;
	}
	
	public static void main(String[] args) {
		int[] num = {1,6,2,5,7,6,3,10};
		ArrayList<Integer> arl = new ArrayList<>();
		for(int x : num) {
			arl.add(x);
		}
		FindMissingNumFrmRangeToArrayList missNum = new FindMissingNumFrmRangeToArrayList();
		System.out.println("Find a missing number in a range [1-10] from given ArrayList.\n"+arl+"\nOutput: "+missNum.missingNumFrmRangeToArrayList(arl, 1, 10));
	}
}
