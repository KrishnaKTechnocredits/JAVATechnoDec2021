package technocredits.stringdemo;

public class Example9 {

	void primeNumInRange(int startRange, int endRange) {
		for(int num = startRange; num<=endRange;num++) {
			
		}
	}
	
	void processData1() {
		double[] arr = {20.2,55.6,13.2,66.4};
		double sum = 0;
		
		for(double num : arr) {
			System.out.println(num);
		}
		
		for(int index=0; index<arr.length;index++) {
			double num = arr[index]; 
			System.out.println(num);
		}
		
		System.out.println("sum : " + sum);
	}
	
	/*void processData2() {
		int num = 100;
		for( : num) { // we cant use enhance for loop in case of datatype, we can only use it when we have array.
			
		}
	}*/
	
	void processString() {
		String str = "technocredits";
		char[] chArr = str.toCharArray();
		
		for(char ch : chArr) {
			
		}
	}
	
	void processData() {
		char[] arr = {'a','g','p','w'};
		
		for(char ch : arr) {
			System.out.println(ch);
		}

		/*for(int index=0;index<arr.length;index++) {
			
		}
		
		int index=arr.length-1;
		while(index>=0) {
			index = index + 5;
		}
		
		do {
			index++;
		}while(index<arr.length);*/
		
	}
	
	public static void main(String[] args) {
		new Example9().processData1();
	}
}
