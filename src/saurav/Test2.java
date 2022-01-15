package saurav;

public class Test2 {
	
	void  input( int[] input , int sum) {	
		 int num1 = 0;
		 int num2 = 0;
		for(int index =0; index<input.length; index++) {
			for(int innerIndex = index+1; innerIndex<input.length; innerIndex++) {
				 num1 =input[index];
				 num2 =input[innerIndex];
				if(input[index]+input[innerIndex]==sum) {
					System.out.print(num1+",");
					System.out.println(num2);
				}
			}
		}
	}
	
	void printNum(int input2[]) {
		for(int index=0; index<input2.length; index++) {
			boolean flag = true;
			for(int innerIndex =0; innerIndex<input2.length; innerIndex++) {
						if(index!=innerIndex && input2[innerIndex]==input2[index] ) {
							flag=false;
							break;
						}
			}
			if(flag==true) 
			System.out.println(input2[index]);							
		}
	}
	public static void main(String[] a) {
		Test2 num = new Test2() ;
		System.out.println("numbers making sum 6 :");
		int[]input = {5,1,2,7,6,3,4,9};
		num.input(input,6);
		System.out.println();
		System.out.println("non repeated num are :");
		int[] input2= {5,8,1,2,4,3,2,1};
		num.printNum(input2);
	}
	 
}
