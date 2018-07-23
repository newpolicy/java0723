package udps;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServerMain {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(9999);
			System.out.println("시스템 대기중....");
		
			while(true) {
				byte [] ar = new byte[1024]; //데이터를 저장할 배열을 생성한다
				DatagramPacket dp = new DatagramPacket(ar, 1024);
				ds.receive(dp);
				String msg = new String(ar, 0, 1024);
				System.out.println( dp.getAddress() + ", " + dp.getPort());
				System.out.println(msg);
			}
			
		}catch (Exception e) {
		System.out.println(e.getMessage());	
		}

	}

}
