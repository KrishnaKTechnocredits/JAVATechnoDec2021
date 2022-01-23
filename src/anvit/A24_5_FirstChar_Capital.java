package anvit;

public class A24_5_FirstChar_Capital {
	
	void getString(String input) {
		String[] arr = input.split(" ");
		String str = "";
		for(int index = 0 ;index<arr.length;index++) {
			char ch = Character.toUpperCase(arr[index].charAt(0));
			String temp = ch + arr[index].substring(1); 
			str = str + " " + temp;
		}
		System.out.println(str.trim());
	}
	
	public static void main(String[] args) {
		A24_5_FirstChar_Capital a24_5_FirstChar_Capital = new A24_5_FirstChar_Capital();
		a24_5_FirstChar_Capital.getString("anvit harsh dipali");
	}
}
