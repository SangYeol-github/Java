package exam01;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

	public static void main(String[] args) {
		
		try {
			
			Socket socket =	new Socket("localhost", 5001);
//			localhost 내 컴퓨터 서버에 연결 요청해줘.
			
			ObjectOutputStream outStream =
			new ObjectOutputStream(socket.getOutputStream());
			
			outStream.writeUTF("박상열이 전송");
			outStream.flush();
			
			ObjectInputStream inStream =
			new ObjectInputStream(socket.getInputStream());
			
			String msg = inStream.readUTF();
			
			System.out.println("서버로부터 전송되어진 메세지: " + msg);
			
			inStream.close();
			outStream.close();
			socket.close();
			
		} catch (UnknownHostException e) {
				
		} catch (IOException e) {
				
		}
		

	}

}
