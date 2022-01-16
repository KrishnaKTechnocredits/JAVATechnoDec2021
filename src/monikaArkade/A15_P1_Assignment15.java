package monikaArkade;

public class A15_P1_Assignment15 {
	int[] num = {10,105,168,2};
	int max = num[0];
	int maximumNumber() {
		for(int index=1;index<num.length;index++) {
			if(max<num[index])
				max=num[index];
		}
		return max;	
	}
	
	void printOutput() {
		System.out.println("Maximum Number from given string : "+ max);
	}
	
	public static void main(String[] args) {
		A15_P1_Assignment15 maxnum = new A15_P1_Assignment15();
		maxnum.maximumNumber();
		maxnum.printOutput();
	}

}
