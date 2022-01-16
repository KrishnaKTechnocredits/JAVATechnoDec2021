package shivangi;

public class A17_PrintingTripletsOfSequenseNum {
		
		void printTripletsOfSeqNum(int[] num) {
			for(int index=0; index<num.length-2; index++){
				if(num[index]+1 == num[index+1] && num[index]+2 == num[index+2]){
					System.out.println(num[index] + "," + num[index+1] + "," + num[index+2]);
				}
			}
		}
		public static void main(String[] args){
			int[] num = {10,13,14,15,16,19,20,22,23,24};
			new A17_PrintingTripletsOfSequenseNum().printTripletsOfSeqNum(num);
		}
		
}
