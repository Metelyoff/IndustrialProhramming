package chapter_15_net_programms;
import java.io.*;
import java.net.*;

public class Recipient { 
	public static void main(String[] args) { 
		File file = new File("/storage/sdcard0/AppProjects/WorkSpaceGit/IndustrialProhramming/src/chapter_15_net_programms/toxic2.txt"); 
		System.out.println("Прием данных..."); 
		try { // прием файла 
			acceptFile(file, 8033, 1000); 
		} catch (IOException e) { 
			e.printStackTrace();
		} 
	} 
	private static void acceptFile(File file, int port, 
								   int pacSize) throws IOException { 
		byte data[] = new byte[pacSize]; 
		DatagramPacket pac = 
			new DatagramPacket(data, data.length); 
		DatagramSocket s = new DatagramSocket(port); 
		FileOutputStream os = 
			new FileOutputStream(file); 
		try { 
			/* установка времени ожидания: если в течение 10 секунд 
			 не принято ни одного пакета, прием данных заканчивается*/ 
			s.setSoTimeout(60000); 
			while (true) { 
				s.receive(pac); 
				os.write(data); 
				os.flush(); 
			} 
		} catch (SocketTimeoutException e) { 
// если время ожидания вышло 
			os.close(); 
			System.out.println( 
				"Истекло время ожидания, прием данных закончен"); 
		} 
	} 
}
