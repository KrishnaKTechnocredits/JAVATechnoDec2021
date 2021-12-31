package monikaArkade;

public class A15_P4_Assignment15 {
	int[] num={10,20,-33,-55,2};
	int positiveCount=0;
	int sum = 0;
	
	void numberCount() {
		for(int index=0;index<num.length;index++) {
			if(num[index]>=0) {
				sum = sum + num[index];
				//positiveCount++;
			}
		}
		System.out.println("Sum of positive numbers: "+sum);
	}
	
	public static void main(String[] args) {
		A15_P4_Assignment15 numCount = new A15_P4_Assignment15();
		numCount.numberCount();
	}

}
