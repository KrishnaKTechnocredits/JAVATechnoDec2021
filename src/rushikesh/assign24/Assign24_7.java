package rushikesh.assign24;

//Program 7. WAP to reverse the case of each char in a given word
//Input    : "TeCHnoCReditS"
//Output : "tEchNOcrEDITs"

public class Assign24_7 {
	String str1="";
	String reverseEachCase(String str){
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isUpperCase(ch)) {
				char ch1=Character.toLowerCase(ch);
				str1+=ch1;
			}else {
				char ch2=Character.toUpperCase(ch);
				str1+=ch2;
			}
		}
		 return str1;		
	}
	public static void main(String[] args) {
		Assign24_7 assign24_7=new Assign24_7();
		String str2=assign24_7.reverseEachCase("TeCHnoCReditS");
		System.out.println(str2);
	}
}
