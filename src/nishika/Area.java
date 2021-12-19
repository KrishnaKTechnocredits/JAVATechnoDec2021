package JAVATechnoDec2021;

class Area{
	
	void sArea(int l){
		int ans=l*l;
		System.out.println("area is "+ans);
	}
	
	public static void main(String[] arr){
		Area area = new Area();
		area.sArea(10);
		area.sArea(20);
		area.sArea(50);
	}
}