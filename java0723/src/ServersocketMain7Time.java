import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServersocketMain7Time {

	public static void main(String[] args) {
		try { 
			ServerSocket ss = new ServerSocket(6189); //서버 소켓 생성
			while(true) {
				System.out.println("서버 대기 중...123");
				Socket s = ss.accept();  //클라이언트 접속 대기-클라이언트가 접속하면 클라이언트와의 통신을 위한 Socket을 리턴하고 다음 줄의 코드 실
				
				BufferedReader br = new BufferedReader(
						new InputStreamReader(s.getInputStream()));//한줄의 데이터를 읽어 출력 해보자
				String msg = br.readLine();
				System.out.println("msg: " + msg );
				System.out.println("who: " + s.getInetAddress());
				//System.out.println("읽: " );
						
			}
		
		}catch (Exception e) {
			 System.out.println(e.getMessage());
		}

	}

}
