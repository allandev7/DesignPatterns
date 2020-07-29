package FactoryMethod;

public abstract class Menu {
	private int nomeCardapio;
	
	protected abstract void exibir();
	
	public int getNomeCardapio() {
		return nomeCardapio;
	}
	public void setNomeCardapio(int nomeCardapio) {
		this.nomeCardapio = nomeCardapio;
	}
}
