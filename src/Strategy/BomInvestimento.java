package Strategy;

public class BomInvestimento implements CalculoInvestimento{

	@Override
	public Double calcularRentabilidade(double investido, int anos) {
		return (investido * 0.12) * anos;
	}

	@Override
	public Double calcularTotal(double investido, int anos) {
		return calcularRentabilidade(investido, anos) + investido;
	}
}
