package debasmita;

public class A17_Triplet {
	 void triplet(int[] input) {
		 for(int i=0;i<input.length-2; i++) {
			 if(input[i]+1==input[i+1] && input[i]+2==input[i+2]) {
				 System.out.println(input[i] +" -> "+ input[i+1] +"->"+ input[i+2]);
			 }
		 }
	 }
      public static void main(String[] args) {
    	  A17_Triplet tr1=new A17_Triplet();
    	  int[] input={10,13,14,15,16,19,20,22,23,24};
    	  System.err.println("The Required sequence is :");
    	  tr1.triplet(input);
	 }
}
