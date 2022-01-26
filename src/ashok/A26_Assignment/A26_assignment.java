package ashok.A26_Assignment;

public class A26_assignment {

	void getId(String str) {
	
	  String arr[] = str.split("id=");
	  int num = arr.length;
	  System.out.println(arr[num-1]);
	
	}
	 
	public static void main(String[] args) {
	
		A26_assignment obj = new A26_assignment();
		obj.getId("https://drive.google.com/file/d/1k0NGYrGlZsbPKWbZrvY7s8il6GL0CKu9/view?id=123");
		obj.getId("https://drive.google.com/file/d/1k0NGYrGlZsbPKWbZrvY7s8il6GL0CKu9/view?id=23233");
		obj.getId("https://drive.google.com/file/d/1k0NGYrGlZsbPKWbZrvY7s8il6GL0CKu9/view?id=343434");
	}

}
