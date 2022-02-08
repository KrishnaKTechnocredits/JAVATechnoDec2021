package shital;
import java.util.Arrays;

public class Program2_Test_27Jan2022 {
	
	
	void lenghthOfWordCountIsPrime(String str) {
		int num=0;
		String temp="";
		String[] arr=str.split(" ");
		for(int index=0;index<arr.length;index++) {
			int wordlength=arr[index].length();
			if(wordlength%2==0) {
				num=wordlength;
				temp=arr[index];
				System.out.println(temp);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2_Test_27Jan2022 programmingTest_27Jan2022=new Program2_Test_27Jan2022();
		String  str = "I love my India";
		programmingTest_27Jan2022.lenghthOfWordCountIsPrime(str);

		String  str1 = " I would like to have a cup of tea";
		programmingTest_27Jan2022.lenghthOfWordCountIsPrime(str1);
		 
	}
}
