package shital;

import java.util.Arrays;

public class A23_ArrayIdenticalOrNot {
	static int a[] = null;
	
	void compareArrayIdenticalorNot(int[] arr1, int[] arr2) {
		boolean flag=false;
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i])
					flag=true;
			}
			if(flag==false)
				System.out.println("Both Arrays are identical");
		}
		else
			System.out.println("Both Arrays are not identical");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A23_ArrayIdenticalOrNot arrayIdenticalOrNot=new A23_ArrayIdenticalOrNot();
		int[] arr1 = {10,44,-33};
		int[] arr2 = {10,44,-33};
		
		int[] arr3 = {10,44,-33};
		int[] arr4 = {10,44,-33,55};
		
		arrayIdenticalOrNot.compareArrayIdenticalorNot(arr1, arr2);
		arrayIdenticalOrNot.compareArrayIdenticalorNot(arr3, arr4);
	}
}
