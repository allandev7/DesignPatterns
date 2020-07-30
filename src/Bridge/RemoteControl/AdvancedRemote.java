package Bridge.RemoteControl;

import Bridge.Devices.Device;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device) {
		super.device = device;
	}

	public void mute() {
		if (device.getVolume() == 0) {
			System.out.println("UnMute");
			device.setVolume(10);
		} else {
			System.out.println("Mute");
			device.setVolume(0);
		}

	}
}
