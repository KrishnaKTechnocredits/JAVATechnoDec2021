package nehaPandey;

public class A17_P1_TripletCons {
	
	void findConsecutive(int[] num) {

		for (int index = 0; index < num.length - 2; index++) {
			
			int firstConsNum = num[index + 1];
			int lastConsNum = num[index + 2];
			if (firstConsNum == num[index] + 1 && lastConsNum == firstConsNum + 1)

				System.out.println("The three Consecutive numbers are: "+num[index] + "->" + firstConsNum + "->" + lastConsNum);
		}
	}

	public static void main(String[] args) {
		A17_P1_TripletCons as = new A17_P1_TripletCons();
		int[] arr = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		as.findConsecutive(arr);

	}

}
