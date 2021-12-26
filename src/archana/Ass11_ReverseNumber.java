package archana;

public class Ass11_ReverseNumber {
	static void reverseNumber(int num)
    {
		int rev =0;		
		while(num>0) {
			int r = num%10;			
			rev=rev*10+r;
			num=num/10;				
		}
		System.out.println("Reverse Number 123 as: " + rev);
    }
    static public void main (String[] args)
    {        
        reverseNumber(123);
    }

}
