package debasmita;

public class SquareOfNumber {
	void squaringNumber(int[] input){
		 boolean flag=false;
		for(int i=0;i<input.length-1;i++){
		  if(input[i+1]==input[i]*input[i]){
		  flag=true;
		  }else{
		     flag = false;
		  }
		 } 
		 if(flag==true){
		   System.out.println("The number is square of previous number");
		  }else{
		  System.out.println("The number is not a square of previous number");
		  }
		}
	public static void main(String[] args) {
		SquareOfNumber squareofnumber=new SquareOfNumber();
		int[] arr={2,4,16,256};
		squareofnumber.squaringNumber(arr);

	}

}
