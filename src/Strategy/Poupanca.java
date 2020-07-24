package Strategy;


public class Poupanca implements CalculoInvestimento {
	
	@Override
	public Double calcularRentabilidade(double investido, int anos) {
		return (investido * 0.037) * anos;
	}

}
