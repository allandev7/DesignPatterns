package Bridge.Devices;

public interface Device {
	//aqui poderia haver outros metodos para controla
	void setVolume(int percent);
	int getVolume();
	void printStatus();
}
