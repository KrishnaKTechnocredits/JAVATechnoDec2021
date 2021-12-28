package saurav;

import java.util.Scanner;

public class A12_P5_ReversrNum {// completed

	int prime(int num) {
		int index = 0;
		while (num > 0) {
			index = index * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(index);
		return index;
	}

	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number : ");
		int num = sc.nextInt();
		System.out.print("output : ");
		A12_P5_ReversrNum mantar = new A12_P5_ReversrNum();
		mantar.prime(12345);
		sc.close();
	}
}
