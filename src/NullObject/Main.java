package NullObject;

public class Main {

	public static void main(String[] args) {
//		Este padrão serve basicamente para evitar os famigerados nullPointerException
//		ao ter um nullObject retorna-se uma classe com valores zerados
		
		//Muitas das necessidades desse padrão pode ser resolvida no Java com o Optional
		
		Food bigMac = FactoryFood.getFood("Big Mac");
		Food whopper = FactoryFood.getFood("Whopper");
		
		System.out.println(bigMac.getName() + " - " + bigMac.getTotalPrice());
		System.out.println(whopper.getName() + " - " + whopper.getTotalPrice());

	}

}
