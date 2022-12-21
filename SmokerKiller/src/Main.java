
public class Main {

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.init();
		LoginPage lgPage = new LoginPage(shop);
		lgPage.setVisible(true);
	}

}
