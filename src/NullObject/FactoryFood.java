package NullObject;

public class FactoryFood {
	public static final String[] foods = {"Big Mac", "Cheddar McMelt"};
	public static Food getFood(String name) {
		for(String food : foods) {
			if(name == food)
				return new FastFood(food, 20, 2);
		}
		return new NullFood();
	}
}
