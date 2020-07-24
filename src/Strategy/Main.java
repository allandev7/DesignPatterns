package Strategy;

public class Main {
	public static void main(String[] args) {
//		Este é o padrao mais comum, e o que inicia nossa jornada
//		Ele deve ser usado quando há diversos comportamentos em uma classe, que esta
//		causando diversos ifs, ou switch case, ainda com a facilidade de criar um
//		metodo abstrato no nosso enum que usaremos como fabrica, tudo fica ainda mais 
//		limpo.
		
//		Com o STRATEGY você pode além de eliminar as condicionais na classe principal,
//		também pode ser alterado unicamente, sem necessidade de alterar a classe, facilitando assim
//		o processo de testes unitários
		
//		Tome cuidado ao escolher esse padrao, ele deve configurar os comportamentos (inclusive os null)
//		e também deve evitar overflow de classes a ponto de dificultar o gerenciamento
		
		CalculoInvestimento investCommon = TipoInvestidor.COMUM.factoryEnum();
		CalculoInvestimento investSmart = TipoInvestidor.INTELIGENTE.factoryEnum();
		
		double investido = 100;
		int anos = 1;
		System.out.println("Aqui temos um rendimento comum: " + 
		investCommon.calcularRentabilidade(investido, anos));		
		System.out.println("Aqui temos um rendimento inteligente: " + 
				investSmart.calcularRentabilidade(investido, anos));
		}
}
