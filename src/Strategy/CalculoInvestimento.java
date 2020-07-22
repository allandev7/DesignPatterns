package Strategy;

public interface CalculoInvestimento {
	Double calcularRentabilidade(double investido, int anos);
	Double calcularTotal(double investido, int anos);
}
