package chapter_15_net_programms;
import java.net.*;
import java.io.*;

public class UnCheckedHost { 
	public static void main(String[] args) { 
		// задание IP-адреса лаборатории bsu.iba.by в виде массива 
		byte ip[] ={(byte)217, (byte)21, (byte)43, (byte)10}; 
		try { 
			InetAddress addr = 
				InetAddress.getByAddress("University", ip); 
			System.out.println(addr.getHostName() 
							   + "-> cоединение:" + addr.isReachable(1000)); 
		} catch (UnknownHostException e) { 
			System.out.println("адрес недоступен"); 
			e.printStackTrace(); 
		} catch (IOException e) { 
			System.out.println("ошибка потока");
			e.printStackTrace(); 
		} 
	} 
}
