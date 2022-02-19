package gauravk.Programs47;
import java.util.Arrays;

/*
 * 17.Write a program that sort array without using any predefined methods
i/p : {5,1,2,7,6,3,4,9}
o/p : {1,2,3,4,5,6,7,9}
 */
public class SortingArraysWithoutPreDefinedMethods {
	
	void sortWithoutPreDefinedMethods(int[] arr) {
		System.out.println(Arrays.toString(arr));
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] input = {5,1,2,7,6,3,4,9};
		SortingArraysWithoutPreDefinedMethods sortObj = new SortingArraysWithoutPreDefinedMethods();
		sortObj.sortWithoutPreDefinedMethods(input);
	}
}
