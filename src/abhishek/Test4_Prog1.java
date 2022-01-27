package abhishek;
class Test4_Prog1{

	boolean nextElementIsSquare(int[] arr) {
		boolean flag = true;
		for(int index=0; index<arr.length-1; index++)
			if(arr[index+1] != arr[index]*arr[index]) {
				flag=false;
				break;
			}

		return flag;
	}

	public static void main(String[] args) {
		int[] arr= {2,4,16,256};				
		Test4_Prog1  test4_prog1= new Test4_Prog1();
		System.out.println(test4_prog1.nextElementIsSquare(arr));
		
	}

}