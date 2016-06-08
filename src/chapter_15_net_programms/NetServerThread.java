package chapter_15_net_programms;
import java.net.*;
import java.io.*;

public class NetServerThread { 
	public static void main(String[] args) { 
		try { 
			ServerSocket serv = new ServerSocket(8071); 
			System.out.println("initialized"); 
			while (true) { 
				//ожидание клиента 
				Socket sock = serv.accept(); 
				System.out.println( 
					sock.getInetAddress().getHostName() 
					+ " connected"); 
				/*создание отдельного потока для  обмена 
				 данными с соединившимся клиентом*/ 
				ServerThread server = new ServerThread(sock); 
				server.start();//запуск потока 
			} 
		} catch (IOException e) { 
			System.err.println(e); 
		} 
	} 
}
