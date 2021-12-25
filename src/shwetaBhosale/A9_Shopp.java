package shwetaBhosale;

public class A9_Shopp {
	int maggieStock = 50, dosaStock = 43, pouchesStock = 39, panipuriStock = 43, masalaStock = 73;

	void purchase(int maggie, int dosa, int pouch, int panipuri, int masala) {

		if (maggie <= maggieStock) {
			maggieStock = maggieStock - maggie;
		} else {
			System.out.println("Maggie Out Of Stock !!!!!!!");
		}
		if (dosa <= dosaStock) {
			dosaStock = dosaStock - dosa;
		} else {
			System.out.println("dosaSOut Of Stock !!!!!!!");
		}
		if (pouch <= pouchesStock) {
			pouchesStock = pouchesStock - pouch;
		} else {
			System.out.println("pouches Out Of Stock !!!!!!!");
		}
		if (panipuri <= panipuriStock) {
			panipuriStock = panipuriStock - panipuri;
		} else {
			System.out.println("panipuri Out Of Stock !!!!!!!");
		}
		if (masala <= masalaStock) {
			masalaStock = masalaStock - masala;
		} else {
			System.out.println("Masala Out Of Stock !!!!!!!");
		}
	}

	void availableStock() {
		if (maggieStock > 0)
			System.out.println("Available Stock of Maggie is : " + maggieStock);
		if (dosaStock > 0)
			System.out.println("Available Stock of Dosa is : " + dosaStock);
		if (pouchesStock > 0)
			System.out.println("Available Stock of Pouch is : " + pouchesStock);
		if (panipuriStock > 0)
			System.out.println("Available Stock of Panipuri is : " + panipuriStock);
		if (masalaStock > 0)
			System.out.println("Available Stock of Masala is : " + masalaStock);
	}

	void outOfStock() {
		if (maggieStock == 0)
			System.out.println("Masala Out Of Stock !!!!!!!");
		if (dosaStock == 0)
			System.out.println("Dosa Out Of Stock !!!!!!!");
		if (pouchesStock == 0)
			System.out.println("Pouches Out Of Stock !!!!!!!");
		if (panipuriStock == 0)
			System.out.println("Panipuri Out Of Stock !!!!!!!");
		if (masalaStock == 0)
			System.out.println("Masala Out Of Stock !!!!!!!");
	}

	public static void main(String[] args) {
		A9_Shopp shop = new A9_Shopp();
		shop.purchase(50, 12, 5, 9, 0);
		shop.availableStock();
		shop.outOfStock();
	}
}