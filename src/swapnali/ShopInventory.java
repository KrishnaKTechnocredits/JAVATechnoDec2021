package swapnali;

public class ShopInventory {

	int MaggieQty=50,DosaQty=43,OilQty=39,PanipuriQty=43,MasalaQty=73;
	
	public static void main(String[] args) { 
		
		ShopInventory shop=new ShopInventory();
		shop.purchaseItem(52, 43, 37, 40, 75);
		shop.printAvailableStockItem();
		shop.printOutOfStockItem();
		
	}
	void purchaseItem(int orderedMaggie,int orderedDosa,int orderedOil,int orderedPanipuri,int orderedMasala) {
		System.out.println("**********Purchase History***********");
		if(orderedMaggie<=MaggieQty) {
			System.out.println(orderedMaggie+" maggies packets are ordered ");
			MaggieQty=MaggieQty-orderedMaggie;
			System.out.println(MaggieQty+" maggie packets are available in stock ");
		}
		else
		{
			System.out.println(orderedMaggie+ " maggie packets are not available in stock "+MaggieQty+"  maggie packets are only available ");
		}
		if(orderedDosa<=DosaQty) {
			System.out.println(orderedDosa+" dosa packets are ordered ");
			DosaQty=DosaQty-orderedDosa;
			System.out.println(DosaQty+" dosa packets are available in stock");
		}
		else
		{
			System.out.println(orderedDosa+ " dosa packets are not available in stock "+DosaQty+" dosa packets are only available");
		}
		if(orderedOil<=OilQty) {
			System.out.println(orderedOil+" Oilpackets are ordered ");
			OilQty=OilQty-orderedOil;
			System.out.println(OilQty+" oil packets are available in stock ");
		}
		else
		{
			System.out.println(orderedOil+ " oil packets are not available in stock "+OilQty+" oil packets are only available");
		}
		if(orderedPanipuri<=PanipuriQty) {
			System.out.println(orderedPanipuri+" panipuri packets are ordered ");
			PanipuriQty=PanipuriQty-orderedPanipuri;
			System.out.println(PanipuriQty+" panipuri packets are available in stock");
		}
		else
		{
			System.out.println(orderedPanipuri+ " panipuri packets are not available in stock "+PanipuriQty+" panipuri packets are only available");
		}
		if(orderedMasala<=MasalaQty) {
			System.out.println(orderedMasala+" masala packets are ordered ");
			MasalaQty=MasalaQty-orderedMasala;
			System.out.println(MasalaQty+" masala packets are available in stock");
		}
		else
		{
			System.out.println(orderedMasala+ " masala packets are not available in stock "+MasalaQty+" masala packets are only available");
		}
	}
	
	void printOutOfStockItem() {
		System.out.println("**********OutOfStock History***********");
		if(MaggieQty==0)
			System.out.println("Maggie is Out of stock");
		if(DosaQty==0)
			System.out.println("Dosa is Out of stock");
		if(OilQty==0)
			System.out.println("Oil is Out of stock");
		if(PanipuriQty==0)
			System.out.println("Panipuri is Out of stock");
		if(MasalaQty==0)
			System.out.println("Masala is Out of stock");
		
	}
	void printAvailableStockItem() {
		System.out.println("**********Stock Available History***********");
		if(MaggieQty>0)
			System.out.println(MaggieQty +" Maggie packets are available in stock");
		if(DosaQty>0)
			System.out.println(DosaQty+" Dosa packets are available in stock");
		if(OilQty>0)
			System.out.println(OilQty+" Oil packets are available in stock");
		if(PanipuriQty>0)
			System.out.println(PanipuriQty+" Panipuri packets are available in stock");
		if(MasalaQty>0)
			System.out.println(MasalaQty+" Masala packets are available in stock");
	}
}
