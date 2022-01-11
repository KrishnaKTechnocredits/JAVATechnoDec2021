package kalyani;

public class Exam2 {

		void displaySum(int [] arr) {
			int sum =6;
			System.out.println("Pair whose Sum is 6 are : ");
			for (int index = 0; index <arr.length; index++) {
				for(int i = index+1; i <arr.length; i++){
					if(arr[index]+arr[i]==sum){
					System.out.println(arr[index]+"-->"+arr[i]);
					}
				}
			}
		}
		
		void displaySingleOcc(int [] arr){
			for (int index = 0; index <arr.length; index++) {
				int count =0;
				for(int i = 0; i <arr.length; i++){
					if(arr[index]==arr[i])
						count++;
				}	
					if(count==1)
					System.out.println(arr[index] + " Occurs once " );
			}
		}
		
		public static void main(String arg[]){
			Exam2 exam = new Exam2();
			int array[] = { 6, 8, 1, 2, 4, 3, 2, 1 };
			int array1[] = { 3, 1, 2, 7, 6, 3, 5, 9 };
			exam.displaySum(array1);
			exam.displaySingleOcc(array);
		}
	}
	

