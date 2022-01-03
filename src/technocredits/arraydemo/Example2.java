package technocredits.arraydemo;

public class Example2 {
	
	void processData(int[] num) {
		int[] temp = new int[3];
		temp[0] = num[0];
		temp[1] = num[1];
		temp[2] = num[2];
		temp[1] = 300;
		System.out.println(num[1]); //
	}
	
	void processVariable(int num1) {
		num1 = 200;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,30};
		int num1 = 100;
		
		System.out.println(arr[1]);
		Example2 example2 = new Example2();
		example2.processData(arr);
		example2.processVariable(num1);
		
		//System.out.println(num1); // 200 // 100
		System.out.println(arr[1]); // 20 //300 //10
	}
}
