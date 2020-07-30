package Bridge.RemoteControl;

import Bridge.Devices.Device;

public class BasicRemote implements Remote {
	Device device; // Aqui é onde é feita a ponte

	public BasicRemote() {
		
	}

	public BasicRemote(Device device) {
		this.device = device;
	}

	@Override
	public void VolumeDown() {
		device.setVolume(device.getVolume() - 1);
	}

	@Override
	public void volumeUp() {
		device.setVolume(device.getVolume() + 1);
	}

}
