package sagarAcharya;

import java.util.Arrays;

import java.util.Scanner;

public class A23_P1_Arrays {

		public static void main(String[] args) {
			A23_P1_Arrays a23 = new A23_P1_Arrays();
			int[] arr = {1,11,3,99,66,54,22,44};
			//a23.secondMax(arr);
			//Scanner sc = new Scanner(System.in);
			//System.out.println("Enter your input for nth num of Max -");
			//int n = sc.nextInt();
			//a23.sortMethod(arr1, 5);
			//a23.findDesiredMax(arr,n);
			//a23.findMinNum(arr);
			a23.findNthMax1(arr, 3);
			
		}
		
		int secondMax(int[] input) {
			int max = 0, secondMax = 0,tempIndex = 0;
			if(input[0]>input[1]) {
				max = input[0];
				secondMax = input[1];
			}
			else {
				secondMax = input[0];
				max = input[1];
			}
			for(int i = 2;i<input.length;i++) {
				int num = input[i];
				if(num>max) {
					secondMax = max;
					max = num;
					tempIndex = i;
				}else if(max > num && secondMax<num) {
					secondMax = num;
				}
				System.out.println(secondMax);
			}
			
			input[tempIndex] = 0;
			return secondMax;
		}
		
		static int[] arr2 = {1,11,3,99,66,54,22,44};
		void findNthMax(int num) {
			int ans = 0;
			for(int i = 0;i<num-1;i++) {
				ans = secondMax(arr2);
			}
			System.out.println(ans);
		}
		
		//OR
		
		int findMax(int[] input) {
			int max = findMinNum(input),tempIndex = 0;
			for(int i =0;i<input.length;i++) {
				if(input[i]>max) {
					max = input[i];
					tempIndex = i;
				}
			}
			input[tempIndex] =0;
			return max;
		}
		
		void findNthMax1(int[] input,int num) {
			int ans = 0;
			for(int i = 1;i<=num;i++) {
				ans = findMax(input);
				System.out.println(ans);
			}
			//System.out.println(ans);
		}
		
		//OR
		
		static int[] arr1 = {1,11,3,99,66,54,22,44};
		void sortMethod(int[] input,int maxInput) {
			Arrays.sort(arr1);
			System.out.println(Arrays.toString(arr1));
			System.out.println(arr1[arr1.length-maxInput] );
		}
		
		//OR -- No output for the below code. can you point out what is wrong?

		
		void findDesiredMax(int[] input,int numMax) {
			int count = 0;
			for(int i = 0;i<input.length;i++) {
				int checkNum = input[i];
				for(int innerI = 0;innerI<input.length;innerI++) {
					if(input[innerI]>checkNum) {
						count++;
					}
				}
				if(count == numMax-1) {
					System.out.println(checkNum);
					break;
				}
			}
		}
		
		int findMinNum(int[] input) {
			int minNum = 0;
			for(int i =0;i<input.length;i++) {
				if(minNum>input[i]) {
					minNum = input[i];
				}
			}
			minNum--;
			return minNum;
		}
}

/*
Assignment-23 : 15th Jan'2022

Program 1 : Find second max from given array.
input : {1,11,3,99,66,54,22,44};
output : 66

Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41

Program 3 : Return a string by placing all small characters first, followed by digits, capital letters, special characters.

input : te4c&Hno7CreD-8i*ts
output : tecnoreits478HCD&-*

Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6

Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)

Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46

Program 7 : Verify if 2 arrays are identical

int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};

output : both arrays are identical.

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};

output : both arrays are not identical.
*/