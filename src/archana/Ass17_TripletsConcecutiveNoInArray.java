package archana;

public class Ass17_TripletsConcecutiveNoInArray {

	void TripletsConcecutiveNoInArray(int[] numbers) {

		for (int index = 0; index < numbers.length - 2; index++) {
			int nextIndex = numbers[index + 1];
			int nextTonextIndex = numbers[index + 2];
			if (nextIndex == numbers[index] + 1 && nextTonextIndex == nextIndex + 1)

				System.out.println(numbers[index] + "-" + nextIndex + "-" + nextTonextIndex);
		}
	}

	public static void main(String[] args) {
		Ass17_TripletsConcecutiveNoInArray ass17 = new Ass17_TripletsConcecutiveNoInArray();
		int[] arr = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		ass17.TripletsConcecutiveNoInArray(arr);

	}
}
