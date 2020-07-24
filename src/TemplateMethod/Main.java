package TemplateMethod;

public class Main {
	public static void main(String[] args) {
//		No template method temos uma classe abstrata na qual tem um metodo principal, que usa de outros
//		métodos que deverão ser instanciados nas classes concretas que extender da mesma.
//		
//		Assim como o strategy é um pattern de comportamento, a diferença entre eles é que o strategy
//		usa a delegacão/composição e o template method usa heranças para resolver, se quiser apenas resolver
//		seus problemas de if use o strategy, caso tenha um problema um pouco mais complexo, onde há um metodo
//		principal que se alimenta de métodos semelhantes, use o template
		
		Player player1 = new MP3Player();
		Player player2 = new MP4Player();
		
		player1.executar();
		System.out.println();
		player2.executar();
		
	}
}
