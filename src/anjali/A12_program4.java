/*Assignment - 12 : 26th Dec'20216. 
 Reverse number [program - 4]   */

package anjali;

import java.util.Scanner;

 public class A12_program4 {
	 
	int reverseNumberByoneWay(int num){
		int reverse=0;
		int remainder=0;
		while(num>0) {
		remainder=num%10;
		reverse=(reverse*10+remainder);
		num=num/10;
		}
		return reverse;
	}
	
	void  reverseNumberBysecondWay(int num) {
		int remainder;
	    while(num>0){
			remainder=num%10;
			System.out.print(remainder);
			num=num/10;
		}
	}    
	
	public static void main(String[] args) {
		A12_program4  a12_program4=new  A12_program4();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter the No :");
		int number=scanner.nextInt();
		int reservseNo =a12_program4.reverseNumberByoneWay(number);
		System.out.println("The Reverse of given no is :"+reservseNo);
		System.out.println("******************************************************");
		a12_program4.reverseNumberBysecondWay(number);
		scanner.close();
	
	}

}
