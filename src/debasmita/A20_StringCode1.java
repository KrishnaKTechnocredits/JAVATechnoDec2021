package debasmita;

public class A20_StringCode1 {
	
	 int sum=0;
	 
	 int sumOfAllDigits(String input){
		 for(int i=0;i<input.length();i++) {
			 char ch=input.charAt(i);
			 if(Character.isDigit(ch)) {
				 int num=Character.getNumericValue(ch);
				 sum=sum+num;
			 }
		 }
		          return sum; 
	 }
     public static void main(String[] args) {
    	 A20_StringCode1 code1=new A20_StringCode1();
    	 int temp=code1.sumOfAllDigits("tech1noc9red3its");
    	 System.out.println("Addition of all digits in the given string is: "+temp);
     }
}
