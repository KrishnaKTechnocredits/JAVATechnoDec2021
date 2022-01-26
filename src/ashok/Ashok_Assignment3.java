package ashok;
public class Ashok_Assignment3 {

	void evaluate(int num) {
			System.out.println("Number is : " + num);
			int max = 0;
			while (num > 0) {
				int temp = num % 10;
				if (temp > max) {
					max = temp;
				}
				num = num / 10;
			}
			System.out.println("Max Digit number is "+max);
		}

		public static void main(String[] args) {
			
			Ashok_Assignment3 assignment3 = new Ashok_Assignment3();
			assignment3.evaluate(23456823);

		}
	}
