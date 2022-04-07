package gauravk.Programs47;
import java.util.Arrays;
import java.util.HashSet;

/*
 * 16.Write a program which find the one missing number from the 1 to 10
i/p : {5,1,2,7,6,3,4,8,10}
o/p : 9
 */
public class FindMissingNumFrmRange {
	
	void missingNumFrmRange(int startNum, int endNum, int[] arr) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i=startNum; i<=endNum; i++) {
			int matchCounter=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]==i)
					matchCounter++;
			}
			if(matchCounter<1)
				hs.add(i);
		}
		System.out.println("Finding missing elements from array: "+Arrays.toString(arr)+"\nStart of Range: "+startNum+"\nEnd of Range: "+endNum+"\nMissing elements: "+hs);
	}
	
	public static void main(String[] args) {
		int[] input = {5,1,2,7,6,3,4,8,10};
		FindMissingNumFrmRange numObj = new FindMissingNumFrmRange();
		numObj.missingNumFrmRange(0, 10, input);
	}
}
