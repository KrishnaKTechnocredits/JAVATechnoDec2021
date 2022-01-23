package sham;

public class A24_CapitalFirstLetter {

	void capitalFirstLetterOfString()
	{
		String words="anvit harsh dipali";
		String[] names=words.split(" ");
		String nameWithUpper="";
		for(int i=0;i<names.length;i++){
			char ch=names[i].charAt(0);
		ch=	Character.toUpperCase(ch);
		nameWithUpper= nameWithUpper+ch+names[i].substring(1)+" ";
		
		}
		System.out.println(nameWithUpper);
	}
	public static void main(String[] args) {
		A24_CapitalFirstLetter capitalFirstLetter= new A24_CapitalFirstLetter();
		capitalFirstLetter.capitalFirstLetterOfString();

	}

}
