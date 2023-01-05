import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Order> orders;
	private int quantity;
	private int total;
	private int price;
	
	public ShoppingCart() {
		quantity = 0;
		orders  = new ArrayList<Order>();
	}
	public void add(String n, double p) {
		Order o = new Order(n, p);
		orders.add(o);
		quantity++;
		total++;
		price += p;
	}
	public void printResult() {
		for (int i = 0; i < orders.size(); i++) {
			System.out.println(orders.get(i).info());
		}
	}
	public int getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	
}
