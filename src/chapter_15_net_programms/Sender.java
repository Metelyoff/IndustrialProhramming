package chapter_15_net_programms;
import java.net.*;
import java.io.*;

public class Sender { 
	public static void main(String[] args) { 
		try { 
			byte[] data = new byte[1000]; 
			DatagramSocket s = new DatagramSocket(); 
			InetAddress addr = 
				InetAddress.getLocalHost(); 
			/*файл с именем toxic.mp3 должен лежать в корне проекта*/ 
			FileInputStream fr = 
				new FileInputStream( 
				new File("/storage/sdcard0/AppProjects/WorkSpaceGit/IndustrialProhramming/src/chapter_15_net_programms/toxic.mp3")); 
			DatagramPacket pac; 

			while (fr.read(data) != -1) { 
//создание пакета данных 
				pac = new DatagramPacket(data, data.length, addr, 8033); 
				s.send(pac);//отправление пакета 
			} 
			fr.close(); 
			System.out.println("Файл отправлен"); 
		} catch (UnknownHostException e) { 
			// неверный адрес получателя 
			e.printStackTrace(); 
		} catch (SocketException e) { 
			// возникли ошибки при передаче данных 
			e.printStackTrace(); 
		} catch (FileNotFoundException e) { 
			// не найден отправляемый файл 
			System.err.println("Файл не найден");
			e.printStackTrace(); 
		} catch (IOException e) { 
			e.printStackTrace(); 
		} 
	} 
}
