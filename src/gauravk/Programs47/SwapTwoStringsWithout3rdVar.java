package gauravk.Programs47;
/*
 * 18.Write a program that swaps two strings without using a third variable.
i/p1 : techno, i/p2 : credits

 */
public class SwapTwoStringsWithout3rdVar {
	public static void main(String[] args) {
		String s1="techno";
		String s2="credits";
		System.out.println("Before swapping.");
		System.out.println(s1+"\n"+s2);
		
		s1 = s1+s2;
		s2 = s1.substring(0, s1.length()-s2.length());
		s1= s1.substring(s2.length());
				
		System.out.println("After swapping.");
		System.out.println(s1+"\n"+s2);
		
		System.out.println("****Number swapping********");
		
		int a=4, b=7;
		System.out.println("Before swapping.\n a="+a+"  b="+b);
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("After swapping.\n a="+a+"  b="+b);
	}
}
