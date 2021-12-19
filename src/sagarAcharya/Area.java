package sagarAcharya;

class Area{
	
	void sArea(int length){
		int ans= length * length;
		System.out.println("Area is "+ ans);
	}
	
	public static void main(String[] args){
		Area area = new Area();
		area.sArea(10);
		area.sArea(15);
		area.sArea(6);
		area.sArea(80);
	}
}