package saurav;

import java.util.ArrayList;

public class A31_CollectionUniqueNum {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(1);
		num.add(2);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(6);

		ArrayList<Integer> number = new ArrayList<Integer>();
		for (int index = 0; index < num.size(); index++) {
			int getNum = num.get(index);
			if (num.indexOf(getNum) == num.lastIndexOf(getNum)) {
				number.add(getNum);
			}
		}
		System.out.print("Output array of unique num :"+number);
	}
}


