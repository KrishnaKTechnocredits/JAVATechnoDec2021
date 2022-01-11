package shital;

public class Exam2_Program2 {
	int count;
	
	void findUniqueNo(int[] number) {
		for(int i=0;i<=number.length;i++) {
			count=0;
			for(int num=0;num<number.length;num++) {
				if(number[i]==number[num]) {
					count++;
				}
			}	
			
			if(count==1){
			System.out.println("Unique Number is :"+number[i]);
			}
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam2_Program2 program2=new Exam2_Program2();
		int number[] ={5,8,1,2,4,3,2,1};
		program2.findUniqueNo(number);
	}
}
