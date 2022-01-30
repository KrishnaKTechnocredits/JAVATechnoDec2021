package ashok;

public class Exam5_Ashok_Prime {
	
	void Exam5_Ashok_Prime(String str) {
		
		String arr[] = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int lenght = arr[index].length();
			if (lenght == 1){
				}else if(lenght % 2 != 0 || lenght == 2 || lenght == 1) {
				System.out.print(arr[index]);
				System.out.print(" ");
			}

		}

	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exam5_Ashok_Prime object = new Exam5_Ashok_Prime();
		System.out.println("\nInput : I love my India");
		String str = "I love my India";
		object.Exam5_Ashok_Prime(str);
		System.out.println("\nInput : I would like to have a cup of tea");
		String str1 = "I would like to have a cup of tea";
		object.Exam5_Ashok_Prime(str1);
		
	}

}
