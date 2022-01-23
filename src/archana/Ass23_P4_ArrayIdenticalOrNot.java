package archana;
import java.util.Arrays;
public class Ass23_P4_ArrayIdenticalOrNot {
	void compareArray(int[] a, int[] b) {
		if(a.length == b.length) {
			String array1String = Arrays.toString(a);
			String array2String = Arrays.toString(b);
			if(array1String.equals(array2String))
				System.out.println("An identical array.");
		}
		else
			System.out.println("Not an identical array. ");
	}

	public static void main(String[] args) {
		Ass23_P4_ArrayIdenticalOrNot ass23 = new Ass23_P4_ArrayIdenticalOrNot();
		int[] arr1 = {10,44,-33};
		int[] arr2 = {10,44,-33};
		ass23.compareArray(arr1, arr2);
		int[] arr3 = {10,44,-33};
		int[] arr4 = {10,44,-33,50};
		ass23.compareArray(arr3, arr4);

	}
}
