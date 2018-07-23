package udps;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpSendMain8Time {

	public static void main(String[] args) {
		try{DatagramSocket ds = new DatagramSocket();
		Scanner sc= new Scanner(System.in);
		System.out.println("send msg: ");
		String msg = sc.nextLine();
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, 
				InetAddress.getByName("192.168.0.253"), 9999);
		ds.send(dp);
		
		//sc.close();
		//ds.close();

		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
