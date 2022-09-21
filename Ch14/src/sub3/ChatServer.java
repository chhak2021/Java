package sub3;

import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜 : 2022/09/21
 * 이름 : 김철학
 * 내용 : 채팅 프로그램 실습하기
 * 
 * 실행방법
 *  java  -cp  MyChatting.jar  sub3.ChatServer
 * 
 */
public class ChatServer {

	public static void main(String[] args) {
		System.out.println("[Server]");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			System.out.println("연결 대기...");
			
			socket = serverSocket.accept();
			System.out.println("연결 수립...");
			
			Thread tr1 = new SenderThread(socket);
			Thread tr2 = new ReceiverThread(socket);
			
			tr1.start();
			tr2.start();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
