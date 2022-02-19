package gauravk.Programs47;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/*
 * 42. Write a program that removes all non prime numbers from the given Set.
i/p : {23, 4, 7, 45, 41, 43, 27, 12, 59, 89, 67, 71, 73, 34, 83, 90, 96}
o/p: {23,7,41,43,59,89,67,71,73,83}
 */
public class RemoveAllNonPrimeNum {
	
	ArrayList<Integer> removeNonPrimeNum(int[] arr) {
		ArrayList<Integer> arl = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			int count =0;
			for(int x=arr[i]; x>0; x--) {
				if(arr[i]%x==0) {
					count++;
				}
			}
			if(count<3) {
				arl.add(arr[i]);
			}
		}
		System.out.println("Method used: "+new Object(){}.getClass().getEnclosingMethod().getName());
		return arl;
	}
	
	LinkedHashSet<Integer> removeNonPrimeNumV2(int[] arr) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		for(int x : arr) {
			int count =0;
			for(int i=x; i>0; i--) {
				if(x%i==0) {
					count++;
				}
			}
			if(count<3) {
				lhs.add(x);
			}
		}
		System.out.println("Method used: "+new Object(){}.getClass().getEnclosingMethod().getName());
		return lhs;
	}
	
	LinkedHashSet<Integer> removeNonPrimeNumV3(int[] arr) {
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
		for(int x : arr){
			lhs1.add(x);
			int count=0;
			for(int i=x; i>0; i--) {
				if(x%i==0) {
					count++;
				}
			}if(count>2)
				lhs2.add(x);
		}
		lhs1.removeAll(lhs2);
		System.out.println("Method used: "+new Object(){}.getClass().getEnclosingMethod().getName());
		return lhs1;
	}
	
	
	public static void main(String[] a) {
		int[] nums = {23, 4, 7, 45, 41, 43, 27, 12, 59, 89, 67, 71, 73, 34, 83, 90, 96};
		RemoveAllNonPrimeNum nonPrime = new RemoveAllNonPrimeNum();
		System.out.println("--------- using normal loops and ArrayList-------");
		System.out.println("Remove All non prime numbers from array "+Arrays.toString(nums)+"\nOutput: "+nonPrime.removeNonPrimeNum(nums)+"\n");
		System.out.println("--------- using LinkedHashSet and count loop-------");
		System.out.println("Remove All non prime numbers from array "+Arrays.toString(nums)+"\nOutput: "+nonPrime.removeNonPrimeNumV2(nums)+"\n");
		System.out.println("--------- using LinkedHashSet, loop and removeAll method-------");
		System.out.println("Remove All non prime numbers from array "+Arrays.toString(nums)+"\nOutput: "+nonPrime.removeNonPrimeNumV3(nums));
	}
}
