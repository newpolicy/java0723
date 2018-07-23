package java0723;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./access_log.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		HashMap<String, Integer> tr = new HashMap<>();	
		while (true) {
				String line = br.readLine();
				
				
				String[] ar = line.split(" ");
				// System.out.println(ar[0];
				// System.out.println(line);
				// Integer count = ;
				Integer count = map.get(ar[0]);
				
				if(count == null) {
					map.put(ar[0], 1);
				}
				else {
					map.put(ar[0], count +1);
				}
				Integer traf = tr.get(ar[0]);
				if(traf == null) {
					if(!ar[9].equals("-")) {
						tr.put(ar[0], Integer.parseInt(ar[9]));
					}
					else {
						if(!ar[9].equals("-")) {
							tr.put(ar[0], traf + Integer.parseInt(ar[9]));
							
						}
					}
				}
				
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println("-----------------");
		//keySet = traffic.keySet();
		for(String key : keySet) {
		//	System.out.println(key + ":" + traffic.get(key));
		}
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
