package gauravk.Programs47;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 35. Make a program that removes the longest string from a given set of strings.
i/p : {“hulk”, “black widow”, “ironman”, “thor”, “captain america”, “loki”}
o/p : {“hulk”, “black widow”, “ironman”, “thor”, “loki”}

 */
public class RemoveLongestStringFrmStringSet {
	
	ArrayList<String> removingLongestString(String[] str) {
		ArrayList<String> arl = new ArrayList<>();
		int mxIndex=0;
		for(int i=0; i<str.length-1; i++) {
			arl.add(str[i]);
			if(str[i].length()>str[i+1].length()) {
				mxIndex = i;
			} else mxIndex= i+1;
		}
		arl.add(str[str.length-1]);
		arl.remove(mxIndex);
		return arl;
	}
	
	public static void main(String[] args) {
		String[] words = {"hulk", "black widow", "ironman", "thor", "captain america", "loki"};
		RemoveLongestStringFrmStringSet removeLong = new RemoveLongestStringFrmStringSet();
		System.out.println("removing the longest string from a given set of strings: "+Arrays.toString(words)+"\nOutput: "+removeLong.removingLongestString(words));
	}
}
