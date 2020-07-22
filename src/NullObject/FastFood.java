package NullObject;

public class FastFood extends Food{



	public FastFood(String food, double price, int qtd) {
		this.name = food;
		this.price = price;
		this.quantity = qtd;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getTotalPrice() {
		return this.quantity * this.price;
	}

}
