import java.util.ArrayList;
import java.util.Iterator;

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
	
	public int getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	public void deleteLast(double p) {
		orders.remove(orders.size()-1);
		quantity--;
		total--;
		price -= p;
	}
	public void printResult() {
		for (Order order : orders) {
			System.out.println(order.getName() + "   $" + order.getPrice());
		}
		
	}
	
}
