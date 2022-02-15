package swati.Swati_Test6;

public class SumOfNumber {

	public static void main(String[] args) {
		
		String input= "10 10 20 30";
		String[] arr= input.split(" ");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int temp=Integer.parseInt(arr[i]);
			sum=sum+temp;
		}
		System.out.println("Total sum is "+sum);
	}

}
