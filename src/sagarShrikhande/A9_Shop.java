package sagarShrikhande;

public class A9_Shop {
	int maggie = 50;
	int dosa = 43;
	int oil = 39;
	int panipuri = 43;
	int masala = 73;

	void purchaseItem(int reqMaggie, int reqDosa, int reqOil, int reqPanipuri, int reqMasala) {
		if (maggie >= reqMaggie && reqMaggie > 0)
			maggie = maggie - reqMaggie;
		else
			System.out.println("Insufficient stock of maggie");
		if (dosa >= reqDosa && reqDosa > 0)
			dosa = dosa - reqDosa;
		else
			System.out.println("Insufficient stock of dosa");

		if (oil >= reqOil && reqOil > 0)
			oil = oil - reqOil;
		else
			System.out.println("Insufficient stock of oil");

		if (panipuri >= reqPanipuri && reqPanipuri > 0)
			panipuri = panipuri - reqPanipuri;
		else
			System.out.println("Insufficient stock of panipuri");

		if (masala >= reqMasala && reqMasala > 0)
			masala = masala - reqMasala;
		else
			System.out.println("Insufficient stock of masala");
	}

	void printOutOfStockItem() {
		boolean flag = true;
		if (maggie == 0)
			System.out.println("Maggie packets are out of stock");
		if (dosa == 0)
			System.out.println("Dosa packets are out of stock");
		if (oil == 0)
			System.out.println("oil packets are out of stock");
		if (panipuri == 0)
			System.out.println("Panipuri packets are out of stock");
		if (masala == 0)
			System.out.println("Masala packets are out of stock");
		if (maggie > 0 || dosa > 0 || oil > 0 || panipuri > 0 || masala > 0)
			flag = false;
		if (flag == true)
			System.out.println("All the items are out of stock");
	}

	void printAvailableStockItem() {
		if (maggie > 0)
			System.out.println("Available stock of maggie is: " + maggie);
		if (dosa > 0)
			System.out.println("Available stock of dosa is: " + dosa);
		if (oil > 0)
			System.out.println("Available stock of oil is: " + oil);
		if (panipuri > 0)
			System.out.println("Available stock of panipuri is: " + panipuri);
		if (masala > 0)
			System.out.println("Available stock of masala is: " + masala);
	}

	public static void main(String[] a) {
		A9_Shop a9_Shop = new A9_Shop();
		a9_Shop.purchaseItem(50, 25, 17, 80, 73);
		a9_Shop.printAvailableStockItem();
		a9_Shop.printOutOfStockItem();
	}
}