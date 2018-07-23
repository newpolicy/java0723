import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain8Time {

	public static void main(String[] args) {
		try {
			System.out.println("보낼 메시지:123 ");
			InetAddress ad = InetAddress.getByName("192.168.0.253");
			Socket s = new Socket(ad, 6189);
			System.out.println("보낼 메시지: ");
	 
			Scanner sc = new Scanner(System.in);
			String msg = sc.nextLine();
			
			
			PrintWriter pw = new PrintWriter(s.getOutputStream());//전송할 스트림 생성
			pw.println(msg); //메시지 전송 
			pw.flush(); //메시지 전송 
			
								
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
