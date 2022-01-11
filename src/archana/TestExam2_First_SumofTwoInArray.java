package archana;

public class TestExam2_First_SumofTwoInArray {
	void sumofTwoInArray(int[] num) {
             
		for (int index = 0; index < num.length; index++) {
			int number = num[index];
			for (int index2 = index + 1; index2 < num.length - 1; index2++) {
				if ((number + index2) == 6 ) {
					int Sum = number + index2;
					System.out.println(number + " + " + index2 + " = " + Sum);
					break;
				}
			}
		}
	}
	static public void main(String[] args) {
		int[] num = { 5, 1, 2, 7, 6, 3, 4, 9 };
		TestExam2_First_SumofTwoInArray testExam2First = new TestExam2_First_SumofTwoInArray();
		System.out.println("Sum of two no's is  6 are ");
		testExam2First.sumofTwoInArray(num);
		
	}
}
