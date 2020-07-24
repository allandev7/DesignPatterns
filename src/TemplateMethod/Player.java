package TemplateMethod;

public abstract class Player {
	public final void executar() {
		//poderia ser usado para contas (basicamente como foi feito no exemplo strategy), 
		//algoritimos, usarei apenas como um metodo que ordena outros metodos
		play();
		stop();
		pause();
	}
	public abstract void play();
	public abstract void stop();
	public abstract void pause();
}
