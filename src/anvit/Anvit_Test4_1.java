package anvit;

public class Anvit_Test4_1 {
	
	void findNextNumSquareOrNot(String input) {
		String[] arr = input.split(",");
		int firstNum = 0;
		int count = 0;
		for(int i =0; i<arr.length-1;i++) {
			int num = Integer.parseInt(arr[i]);
			firstNum = num;
			if(firstNum*firstNum == (Integer.parseInt(arr[i+1]))) {
				count++;
			}
		}
		if(count ==arr.length-1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	public static void main(String[] args) {
		Anvit_Test4_1 anvit_Test4 = new Anvit_Test4_1();
		anvit_Test4.findNextNumSquareOrNot("2,4,16,256");
	}
}
