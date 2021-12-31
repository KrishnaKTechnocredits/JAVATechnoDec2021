package monikaArkade;

public class A15_P2_Assignment15 {
	int[] num = {10,105,168,2};
	int min = num[0];
	int minimumNumber() {
		for(int index=1;index<num.length;index++) {
			if(min>num[index])
				min=num[index];
		}
		return min;	
	}
	
	void printOutput() {
		System.out.println("Minimum Number from given string : "+ min);
	}
	
	public static void main(String[] args) {
		A15_P2_Assignment15 maxnum = new A15_P2_Assignment15();
		maxnum.minimumNumber();
		maxnum.printOutput();
	}

}
