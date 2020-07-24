package TemplateMethod;

public class MP4Player extends Player{

	@Override
	public void play() {
		System.out.println("Reproduzindo video...");
		
	}

	@Override
	public void stop() {
		System.out.println("Parando video...");
		
	}

	@Override
	public void pause() {
		System.out.println("Pausando video...");
		
	}

}
