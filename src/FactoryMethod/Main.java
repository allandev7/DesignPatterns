package FactoryMethod;

public class Main {

	public static void main(String[] args) {
//		Este provavemente é o padrão mais conhecido, o padrão FACTORY como o nome ja diz,
//		funciona como uma fabrica que a partir de uma classe factory pode criar um objeto 
//		variando sua forma concreta
//		
//		No exemplo que foi feito aqui, temos o menu abstrato; E o menu Veggie e o Original
//		concretos. com a fabrica podemos passar o tipo do menu como parametro e assim criar o 
//		objeto mais adequado
//		
//		Ainda há a possibilidade de fazer direto do enum, sem necessitar da classe menuFactory
//		(O código esta comentado no enum)
		
		Menu menu = MenuFactory.createMenu(TipoMenu.ORIGINAL);
		
		menu.exibir();

	}

}
