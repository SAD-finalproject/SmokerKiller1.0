
public class Main {

	public static void main(String[] args) {
		try {
			Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sadd","root","12345678");
			System.out.println("Connected successfully");
			Shop shop = new Shop();
			shop.init();
			LoginPage lgPage = new LoginPage(shop);
			lgPage.setVisible(true);
		}


		}catch(SQLException e) {
			System.out.println("Error while connecting");
			e.printStackTrace();
		}
		
		
	}

}
