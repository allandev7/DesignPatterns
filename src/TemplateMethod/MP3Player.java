package TemplateMethod;

public class MP3Player extends Player {

	@Override
	public void play() {
		System.out.println("Reproduzindo áudio...");
	}

	@Override
	public void stop() {
		System.out.println("Parando áudio...");

	}

	@Override
	public void pause() {
		System.out.println("Pausando áudio...");

	}

}
