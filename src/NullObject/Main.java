package NullObject;

public class Main {

	public static void main(String[] args) {
//		Este padrão derve basicamente para evitar os famigerados nullPointerException
//		ao ter um valor null retorna-se uma classe com valores zerados
		
		Food bigMac = FactoryFood.getFood("Big Mac");
		Food whopper = FactoryFood.getFood("Whopper");
		
		System.out.println(bigMac.getName() + " - " + bigMac.getTotalPrice());
		System.out.println(whopper.getName() + " - " + whopper.getTotalPrice());

	}

}
