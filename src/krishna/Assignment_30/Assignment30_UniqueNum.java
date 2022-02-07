package krishna.Assignment_30;

public class Assignment30_UniqueNum {
	static void unique(int number[]) {
		for (int i = 0; i < number.length; i++) {
			int j;
			for (j = 0; j < i; j++)
				if (number[i] == number[j])
					break;
			if (i == j)
				System.out.print(number[i] + " ");
		}
	}

	public static void main(String args[]) {
		int number[] = { 1, 9, 1, 3, 16, 3, 9, 59, 4, 4, 16 };
		int number1[] = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		
		Assignment30_UniqueNum ass = new Assignment30_UniqueNum();
		ass.unique(number);
		System.out.println();
		ass.unique(number1);
		
		
		
	}

}
