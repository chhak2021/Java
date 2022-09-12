package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * 
 * 
 * 콘솔창 2개 띄워서 실행하기
 */
public class TcpClient {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			
			System.out.println("[연결 요청...]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공!!!]");
			
			// 여기까지 연결요청/성공 테스트하기
			////////////////////////////////////////////////////////////
			// 데이터 전송하기(클라이언트 -> 서버)
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Server!";
			
			byte[] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			
			System.out.println("[데이터 전송완료...]");
			
			// 데이터 수신하기(서버 -> 클라이언트)
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readBytes = is.read(bytes);
			
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println("[데이터 수신완료!!!] : "+result);
			
			os.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("TcpClient 종료...");
	}
}
