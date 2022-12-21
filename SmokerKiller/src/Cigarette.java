
public class Cigarette {
	private String name;
	private double price;
	
	public Cigarette(String s ,double p,int stock) {
		name = s;
		price = p;
	}
	public String info() {
		String output = "";
		output += name;
		output += "\n";
		output += "$" + (int)Math.ceil(price);
		return output;
	}
	public void adjustPrice(double rate) {
		price = price*rate;
	}
}
