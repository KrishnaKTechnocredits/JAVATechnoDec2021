/*WAp to find  max digit from given number
 * Input will be as number format onlY DO NOT CHNAGE NUMBER INTO STRING
 *input =6832774
 *output=8
 */
package anjali;

public class Anjali_Exam3 {
	
	int maxFindWithoutUsingString(int num)
	{   
		int max=0;
	
		
		while(num>0) 
		{   
			//System.out.println(num%10);
			int lastdigit=num%10;
		    if(lastdigit>max)
			max=lastdigit;
		    num=num/10;
		}
		return max;
		
	}

	public static void main(String[] args) {
		Anjali_Exam3 anjali_Exam3 = new Anjali_Exam3 ();
		int output=anjali_Exam3.maxFindWithoutUsingString(6832774);
		System.out.println("The maximum digit from given number is "+output);
	}

}

