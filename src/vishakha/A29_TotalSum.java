	package vishakha;
	
	public class A29_TotalSum {
	
		void getExpectedSum(String str) {
			String[] inputArr = str.split(" ");
			int sum = 0;
			for(int index = 0; index < inputArr.length; index++) {
				try {
					sum = sum + Integer.parseInt(inputArr[index]);
				} catch (Exception e) {
				}
			}
			System.out.println("Expected Sum =" + sum);
	
		}
		public static void main(String[] args) {
			A29_TotalSum totalSum = new A29_TotalSum();
			String inputString = "I have 15 years and 3 months of automation experience";
			System.out.println("Input String: " + inputString);
			totalSum.getExpectedSum(inputString);
		}
	}