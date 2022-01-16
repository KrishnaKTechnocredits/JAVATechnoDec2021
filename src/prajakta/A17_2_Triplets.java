package prajakta;

public class A17_2_Triplets {

	   void findTripleConsecutive(int[] num) {
		       for(int index=0; index<num.length-2; index++) {
		       if(num[index]+1==num[index+1]&& num[index]+2==num[index+2])
		    	               System.out.println(num[index]+" "+(num[index]+1)+" "+(num[index]+2));
		       }
	   }
	   
	   public static void main(String[]args) {
		       A17_2_Triplets triplets = new A17_2_Triplets();
		       int[] arr = {10,13,14,15,16,19,20,22,23,24};
		       triplets.findTripleConsecutive(arr);
	   }
}
