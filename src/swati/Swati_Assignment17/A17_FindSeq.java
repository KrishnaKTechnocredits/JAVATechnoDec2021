package swati.Swati_Assignment17;

public class A17_FindSeq {
	void findseq(int[] num) {
		for(int i=0;i<num.length-2;i++) {
			if(num[i]+1==num[i+1] && num[i]+2==num[i+2]) {
				System.out.println("Matching Sequence is "+num[i] + " "  + num[i+1] + " "+ num[i+2]);
			}
		}
	}

	public static void main(String[] args) {
		
		A17_FindSeq a17=new A17_FindSeq();
		int[] arr =  {10,13,14,15,16,19,20,22,23,24};
		a17.findseq(arr);

	}

}
