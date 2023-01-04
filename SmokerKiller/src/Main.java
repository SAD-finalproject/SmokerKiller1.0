
public class Main {

	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart(2);
		Shop shop = new Shop();
		shop.init();
		LoginPage lgPage = new LoginPage(shop, sc);
		lgPage.setVisible(true);
		
	}

}
