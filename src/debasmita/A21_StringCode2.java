package debasmita;

public class A21_StringCode2 {
     
	  String temp="";
	  String printDigitsFromString(String input){
		   for(int index=0;index<input.length();index++) {
			   char ch=input.charAt(index);
			   if(Character.isDigit(ch)) {
				  temp=temp+ch;
			   }
		   }
		        return temp;
	  }
	  public static void main(String[] args) {
		  A21_StringCode2 code2=new A21_StringCode2();
		  String s=code2.printDigitsFromString("Tec1hn2o3C9r6e8d1i9ts");
		  System.out.println("Digits present in the String: "+s);
	}

}
