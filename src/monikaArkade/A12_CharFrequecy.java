package monikaArkade;
import java.util.Scanner;

public class A12_CharFrequecy {
	String str;
	
	void checkFreqofchar(String name) {
		for (int index=0 ;index<name.length();index++)
		{
		    char c = name.charAt(index);		    
		    int charCnt=0;
		    for (int index2=0;index2<name.length();index2++) {	
		    	  if(name.charAt(index2)==c)
		    	   {
		    		charCnt++;
		    	   }   	
		    }
		    str =  "Character : "+c+" : "+ charCnt;
		    if(charCnt>0)
		    System.out.println("Character frequence : "+c+" - "+ charCnt);
		}
	}
	
	public static void main(String[] args) {
		A12_CharFrequecy charFrequency = new A12_CharFrequecy();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.next();
		charFrequency.checkFreqofchar(input);
	}
}
