package exam01;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) {
		
		try {
			
			ServerSocket serverSocket =
			 new ServerSocket(5001); //1024 이하는 사용x
			
			while(true) {
				Socket socket = serverSocket.accept(); //대기하고 있어라.
				
				ObjectInputStream inStream =
				new ObjectInputStream(socket.getInputStream());
	//			Socket 입력 연결통로.
				
				String msg = inStream.readUTF();
	//			유니코드 기반 UTF
				System.out.println("Client가 전송해 온 메세지: " + msg);
				
				if(msg.equals("exit")) {
					serverSocket.close();
					break;
				}
				
				ObjectOutputStream outStream =
				new ObjectOutputStream(socket.getOutputStream());
	//			Socket 출력 연결통로.
				
				outStream.writeUTF("박상열: " + msg);
	//			socket은 내부에 버퍼가 존재.
	//			채팅프로그램은 실시간이 생명.
				outStream.flush(); //버퍼를 바로 전송해라.
				
				outStream.close();
				inStream.close();
				socket.close();
			}
//			serverSocket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
