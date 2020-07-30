package Bridge.Devices;

public class Radio implements Device{
	private int volume = 10;
	@Override
	public void setVolume(int percent) {
		this.volume = percent;
	}

	@Override
	public int getVolume() {
		return this.volume;
	}

	@Override
	public void printStatus() {
		System.out.println("--------------------");
		System.out.println("Radio");
		System.out.println("Volume: "+ getVolume());
		System.out.println("--------------------");
		
	}

}
