package debasmita;

public class WordLengthIsPrimeOrNot {
     boolean NumberIsPrime(int num) {
    	 boolean flag=true;
    	 if(num==1) {
    		 return false;
    	 }
    	 for(int i=2;i<=num/2;i++) {
    		 if(num%i==0) {
    			 flag=false;
    			 break;
    		 }
    	 }
    	     return flag;
     }
     void PrimeWord(String input) {
    	 String[] arr=input.split(" ");
    	 for(int index=0;index<arr.length;index++) {
    		 int length=arr[index].length();
    		 if(NumberIsPrime(length)) {
    			 System.out.println(arr[index]);
    		 }
    	 }
     }
	public static void main(String[] args) {
		WordLengthIsPrimeOrNot wordlengthisprime=new WordLengthIsPrimeOrNot();
		wordlengthisprime.PrimeWord("I love my India");
		System.out.println("******************");
		wordlengthisprime.PrimeWord("I would like to have a cup of tea");
    }
}
