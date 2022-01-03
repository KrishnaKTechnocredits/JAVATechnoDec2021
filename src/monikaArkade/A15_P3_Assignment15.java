package monikaArkade;

public class A15_P3_Assignment15 {
	int[] num={12,-11,99,11,23,-44};
	int positiveCount=0, negativeCount=0;
	
	void numberCount() {
		for(int index=0;index<num.length;index++) {
			if(num[index]>=0) {
				positiveCount++;
			}else {
				negativeCount++;
			}
		}
		System.out.println("Positive number count : "+positiveCount);
	}
	
	public static void main(String[] args) {
		A15_P3_Assignment15 numCount = new A15_P3_Assignment15();
		numCount.numberCount();
	}

}
