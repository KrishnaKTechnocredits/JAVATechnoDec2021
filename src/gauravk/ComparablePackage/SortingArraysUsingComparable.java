package gauravk.ComparablePackage;
import java.util.ArrayList;
import java.util.Collections;

class SortingArraysUsingComparable {
	public static void main(String[] args) {
		ArrayList<IntegerArray> arl = new ArrayList<IntegerArray>();
		int[] arr = { 40, 55, 67, 158, 244, 64, 94, 6, 0, 95 };
		for (int x : arr) {
			arl.add(new IntegerArray(x));
		}
		System.out.println("Before sorting: " + arl);
		Collections.sort(arl);
		System.out.println("After sorting (descending): " + arl);
	}
}

/*
 * we can have multiple classes in same java file. But, there is one restriction
 * over here, which is that you can have as many classes in one file but only
 * one public class is allowed. If we try to declare 2 classes as public in the
 * same file, the code will not compile. Also the public class must be of file
 * name and 'public static void main(String[] a){}' class.
 * 
 * OR the scenario is valid: class containing file name must have 'public static
 * void main(String[] a){}' class to start execution eventhough both classes are
 * declared default.
 */
class IntegerArray implements Comparable<IntegerArray> {
	private int num;

	public IntegerArray(int data) {
		this.num = data;
	}

	// @Override                   //---------Ascending order alternative------//
	// public int compareTo(IntegerArray o) {
	// if(this.num>o.num)
	// return 1;
	// else if (this.num<o.num)
	// return -1;
	// else
	// return 0;
	// }

	@Override
	public int compareTo(IntegerArray o) {
		// return this.num-o.num;   //---------Ascending order------//
		return o.num - this.num;    // ---------Descending order-----//
	}

	@Override
	public String toString() {
		return String.valueOf(this.num);
	}

}