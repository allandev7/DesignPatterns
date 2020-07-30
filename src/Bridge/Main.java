package Bridge;

import Bridge.Devices.Device;
import Bridge.Devices.Radio;
import Bridge.Devices.Tv;
import Bridge.RemoteControl.AdvancedRemote;
import Bridge.RemoteControl.BasicRemote;
import Bridge.RemoteControl.Remote;

public class Main {
//	O padrão Bridge é especialmente útil ao lidar com aplicações de multi plataforma, o
//	ferecer suporte a vários tipos de servidores de banco de dados, ou ao trabalhar com vários provedores
//	de API de um determinado tipo (por exemplo, plataformas em nuvem, redes sociais etc.)
	
//	Ele basicamente é usado quando existe duas variacos de uma mesma coisa, por exemplo se houvessemos
//	formas, e concretamente um circulo e um quadrado, e tivessemos que colocar cores(nao como atributos),
//	e pensariamos e criar classes como CirculoVermelho, CirculoAzul, QuadradoVermelho, QuadradoAzul,
//	basicamente criamos uma ponte entre a forma e a cor e deixamos assim uma estrutura melhor.
	
//	Sempre que imaginar a possibilidade de multiplas hirerarquias lembre sa existencia desse pattern
	
	public static void main(String[] args) {
		Device radio = new Radio();
		Device tv = new Tv();
		
		AdvancedRemote remoteTv = new AdvancedRemote(tv);
		BasicRemote remoteRadio = new BasicRemote(radio);
		
		System.out.println("Primeiro status");
		tv.printStatus();
		
		remoteTv.VolumeDown();
		remoteTv.VolumeDown();
		System.out.println("Abaixei 2");
		tv.printStatus();
		
		remoteTv.volumeUp();
		remoteTv.volumeUp();
		remoteTv.volumeUp();	
		System.out.println("Aumentei 3");
		tv.printStatus();
		
		remoteTv.mute();
		tv.printStatus();
		remoteTv.mute();
		tv.printStatus();

	}
}
