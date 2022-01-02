package monikaArkade;

public class A15_P5_Assignment15 {
	int[] num={10,13,-14,-20,22,3};
	int sum = 0;
	
	void numberCount() {
		for(int index=0;index<num.length;index++) {
			if(num[index]>0) {
				if((num[index]%2)==0) {
				sum = sum + num[index];
				}
			}
		}
		System.out.println("Sum of positive numbers: "+sum);
	}
	
	public static void main(String[] args) {
		A15_P5_Assignment15 numCount = new A15_P5_Assignment15();
		numCount.numberCount();
	}

}
