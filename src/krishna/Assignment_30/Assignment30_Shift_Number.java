package krishna.Assignment_30;

public class Assignment30_Shift_Number {
	void number(int[] n) {
		int count = 0;
		for (int i = 0; i <= n.length - 1; i++) {
			if (n[i] != 0) 
				System.out.print(n[i] + " ");
			else 
				count++;
		}
		for (int j = 0; j <= count - 1; j++) {
			System.out.print(0 + " ");
		}
		System.out.println("");
	}

	public static void main(String args[]) {
		Assignment30_Shift_Number ass = new Assignment30_Shift_Number();
		int numberArray[] = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		ass.number(numberArray);
	}
}
