package anvit;

import java.util.Arrays;

public class A30_Find_Unique_Elements_Array {
	
	void uniqueElements(int[] input) {
		String str = "";
		System.out.print("[");
		for (int i = 0; i < input.length; i++) {
			int j =0;
			for (j = 0; j < i; j++)
				if (input[i] == input[j])
					break;
			if (i == j)
				str = str + input[i] + ", ";	
		}
		str = str.substring(0,str.length()-2);
		System.out.print(str);
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		A30_Find_Unique_Elements_Array a30 = new A30_Find_Unique_Elements_Array();
		int[] input1 = {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16};
		int[] input2 = {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0};
		a30.uniqueElements(input1);
		a30.uniqueElements(input2);
	}
}
/*

2. WAP to find out unique elements from the given array an return in the form of an array.
Input    : {1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16}
Output : {1, 9, 3, 16, 59, 4}

Input    : {19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}

*/