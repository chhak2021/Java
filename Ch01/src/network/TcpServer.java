package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 
 * 내용 : TCP 소켓 프로그래밍 실습 교재 529
 * 콘솔창 2개 띄워서 실행하기
 */
public class TcpServer {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			
			while(true) {
				
				System.out.println("[연결 대기...]");
				
				Socket socket = serverSocket.accept();
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				
				System.out.println("[연결 수락...] : "+isa.getHostName());
				
				// 여기까지 연결요청/성공 테스트하기
				////////////////////////////////////////////////////////////
				// 데이터 수신하기(클라이언트 -> 서버)
				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[100];
				int readBytes = is.read(bytes);
				
				String result = new String(bytes, 0, readBytes, "UTF-8");
				System.out.println("[데이터 수신완료!!!] : "+result);
				
				// 데이터 전송하기(서버 -> 클라이언트)
				OutputStream os = socket.getOutputStream();
				String msg = "Hello Client!";
				
				byte[] msgBytes = msg.getBytes();
				os.write(msgBytes);
				os.flush();
				
				System.out.println("[데이터 전송완료...]");
				
				os.close();
				is.close();
				
				socket.close();
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("TcpServer 종료...");
	}
}
