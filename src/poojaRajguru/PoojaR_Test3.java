package poojaRajguru;

public class PoojaR_Test3 {
		void maxDigit() {
			int max = 0;
			int no = 6832774;
			while (no > 0) {
				int rem = no % 10;
				if (max < rem) {
					max = rem;
				}
				no = no / 10;
			}
			System.out.println("The Max Digit is : " + max);
		}

		public static void main(String[] args) {
			PoojaR_Test3 test = new PoojaR_Test3();
			test.maxDigit();		
		}
}
