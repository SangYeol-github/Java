package exam02;

import java.io.IOException;
import java.net.Socket;

public class ClientChatting {
	public static void main(String[] args) {
		String name = "박상열";
		
		try {
			Socket socket = new Socket("192.168.0.81", 9001);
										//localhost
			Thread sender = new SenderThread(socket, name);
			Thread receiver = new ReceiverThread(socket);
			
			sender.start();
			receiver.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
