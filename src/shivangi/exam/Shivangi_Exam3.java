/*
Exam-3 : WAP to find max digit from given number .
Note - Input will be as number format only, DO NOT CHANGE NUMBER INTO STRING
Input : 6832774
Output :8
*/
package shivangi.exam;

public class Shivangi_Exam3 {

	void findMaxFromNumWithoutConvertiInString(int num) {
		System.out.println("Given number : " + num);
		int max = 0;
		while(num>0) {
			int lastDigit = num%10;
			if(max<lastDigit) {
				max = lastDigit;
			}
			num=num/10;
		}
		System.out.println("Max digit from given number is : " + max);
	}
	
	public static void main(String[] args) {
		Shivangi_Exam3 shivangi_Exam3 = new Shivangi_Exam3();
		shivangi_Exam3.findMaxFromNumWithoutConvertiInString(6832774);
	}
}
