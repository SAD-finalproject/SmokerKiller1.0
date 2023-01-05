import java.util.*;
import java.text.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
		String todaysDate = ft.format(date);
		ShoppingCart sc = new ShoppingCart();
		Shop shop = new Shop();
		shop.init();
		LoginPage lgPage = new LoginPage(shop, sc, date);
		lgPage.setVisible(true);
		
	}

}
