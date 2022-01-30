package hevin;

public class Exam4_Program1 {
	
	void checkSquare(int[] number) {
		int temp = 0;
		
		for (int i = 0; i < number.length-1 ; i++) {
			if (number[i] * number[i] == number[i + 1])
				temp++;
		}

		if (temp == number.length-1)
			System.out.println("True");
		else 
			System.out.println("False");
	}
	  
	public static void main(String[] args){
		Exam4_Program1 exam4 = new Exam4_Program1();
		int[] number= {2,4,16,256};
		exam4.checkSquare(number);		
	}
    
}

