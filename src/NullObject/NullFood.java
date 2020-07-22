package NullObject;

public class NullFood extends Food{

	@Override
	public String getName() {
		return "Não foi possivel obter o nome";
	}

	@Override
	public double getTotalPrice() {
		return 0.0;
	}

}
