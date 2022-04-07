package gauravk.Programs47;
import java.util.TreeSet;

/*
 * 2. Write a program that find max number from array
i/p : {5,1,2,7,6,3,4,9}
o/p : 9
 */
public class MaxNumFrmArray {
	
	void findMaxNumFrmArray(int[] arr) {
		int num = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>num) {
				num=arr[i];
			}
		}
		System.out.println(num);
	}
	
	void findMaxNumFrmArrayV2(int[] arr) {
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i : arr) {
			ts.add(i);
		}
		System.out.println(ts.last());
	}
	
	public static void main(String[] args) {
		int[] numbers = {5,1,2,7,6,3,4,9};
		MaxNumFrmArray mx = new MaxNumFrmArray();
		System.out.println("using conditions and loops");
		mx.findMaxNumFrmArray(numbers);
		System.out.println("using TreeSet and its method");
		mx.findMaxNumFrmArrayV2(numbers);
	}
}
