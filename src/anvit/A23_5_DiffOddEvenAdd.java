package anvit;

public class A23_5_DiffOddEvenAdd {
	
	void mainMethod(String input) {
		int odd = 0;
		int even = 0;
		int total = 0;;
		String str = "";
		for(int i=0 ; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				str = str + ch;
			}else if (str.length()>0){
				int num = Integer.parseInt(str);
				str = "";
				if(num%2==0)
					even = even + num;
				else
					odd = odd + num;
			}
		}
			if (str.length()>0){
			int num = Integer.parseInt(str);
			str = "";
			if(num%2==0)
				even = even + num;
			else
				odd = odd + num;
		}
		total = even - odd;
		System.out.println("Difference between even and odd is: "+ total);
	}
	
	public static void main(String[] args) {
		A23_5_DiffOddEvenAdd a23_5_DiffOddEvenAdd = new A23_5_DiffOddEvenAdd();
		a23_5_DiffOddEvenAdd.mainMethod("te112ch34no29");
	}
}
