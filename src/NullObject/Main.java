package NullObject;

public class Main {

	public static void main(String[] args) {
//	Este padrão serve basicamente para evitar os famigerados nullPointerException ao ter um nullObject
//  retorna-se uma classe com valores zerados, podendo usar como default num switch de uma factory por exemplo
		
//	Ao imaginar em usar esse padrão, pense se alternativas como o Optional nao poderia resolver
		
		Food bigMac = FactoryFood.getFood("Big Mac");
		Food whopper = FactoryFood.getFood("Whopper");
		
		System.out.println(bigMac.getName() + " - " + bigMac.getTotalPrice());
		System.out.println(whopper.getName() + " - " + whopper.getTotalPrice());

	}

}
