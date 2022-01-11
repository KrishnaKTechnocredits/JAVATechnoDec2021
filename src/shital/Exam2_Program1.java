package shital;

public class Exam2_Program1 {

	void findPairOfNumber(int[] number) {
		for(int i=0;i<number.length-i;i++) {
			//int nextValue=number[i];
			for(int num=1;num<number.length;num++)
				if(number[i]+number[num]==6)
			System.out.println(number[i]+"--"+number[num]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam2_Program1 program1=new Exam2_Program1();
		int[] number={5,1,2,7,6,3,4,9};
		program1.findPairOfNumber(number);
	}

}
