
public class Cigarette {
	private String name;
	private double price;
	
	public Cigarette(String s ,double p,int stock) {
		name = s;
		price = p;
	}
	public String printInfo() {
		String output = "";
		output += name;
		output += "\n";
		output += "$" + price;
		return output;
	}
}
