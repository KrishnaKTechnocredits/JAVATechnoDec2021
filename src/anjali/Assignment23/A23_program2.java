/* Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41
 */
package anjali.Assignment23;

public class A23_program2 {
	
	int sumOfNumbersInString(String name){
		int sum=0;
	    String temp="";
		for( int index=0;index<name.length();index++){
			char ch= name.charAt(index);
			if(Character.isDigit(ch))
				temp=temp+ch;
			else if (temp.length()>0){
		       sum=sum+Integer.parseInt(temp);
			    temp="";
			}
		}
		if (temp.length()>0){
		       sum=sum+Integer.parseInt(temp);
			    temp="";
		}
	  return sum;
	 }	
		
	public static void main(String[] args) {
		A23_program2 a23_program2 = new A23_program2();
       int output= a23_program2.sumOfNumbersInString("te12ch22nocre3dits4");
       System.out.println(output);
	}

}
