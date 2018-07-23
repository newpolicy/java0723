package javanet_5Time;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressMain {
	public static void main(String[] args) {		
		InetAddress myad;
		try {
			myad = InetAddress.getByName("www.google.com");
			System.out.println(myad+"\n");
			InetAddress [] ar = InetAddress.getAllByName("www.naver.com");
			for(InetAddress i : ar) {
				System.out.println(i);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
