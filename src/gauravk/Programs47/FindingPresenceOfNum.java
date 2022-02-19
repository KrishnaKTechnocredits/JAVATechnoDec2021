package gauravk.Programs47;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 31.Write a program to find if a given number is present in the arrayList or not.
i/p : {1,6,2,9,3,0,2,4}
number to be check : 5
number to be check : 9
 */
public class FindingPresenceOfNum {
	
	boolean findingPresenceOfNumInArray(int[] arr, int target) {
		boolean flag = false;
		for(int num : arr) {
			if(num==target)
				flag=true;
		}
		return flag;
	}
	
	boolean findingPresenceOfNumInArrayList(int[] arr, int target) {
		boolean flag = false;
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for(int num : arr) {
			arl.add(num);
		}
		flag = arl.contains(target)? true: false;
		return flag;
	}
	
	
	public static void main(String[] args) {
		int[] input = {1,6,2,9,3,0,2,4};
		FindingPresenceOfNum numPresence = new FindingPresenceOfNum();
		System.out.println("The presence of number "+5+" in the array "+Arrays.toString(input)+" is "+numPresence.findingPresenceOfNumInArray(input, 5));
		System.out.println("The presence of number "+9+" in the array "+Arrays.toString(input)+" is "+numPresence.findingPresenceOfNumInArray(input, 9));
		System.out.println("The presence of number "+5+" in the array "+Arrays.toString(input)+" is "+numPresence.findingPresenceOfNumInArrayList(input, 5));
		System.out.println("The presence of number "+9+" in the array "+Arrays.toString(input)+" is "+numPresence.findingPresenceOfNumInArrayList(input, 9));
	}
}
