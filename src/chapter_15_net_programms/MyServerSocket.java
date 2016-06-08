package chapter_15_net_programms;
import java.net.*;
import java.io.*;

public class MyServerSocket { 
	public static void main(String[] args) { 
		Socket s = null; 
		try { // отправка  строки клиенту 
//создание объекта и назначение номера порта 
			ServerSocket server = new ServerSocket(8030); 
			s = server.accept();//ожидание соединения 
			PrintStream ps = 
				new PrintStream(s.getOutputStream()); 
// помещение строки "привет!" в буфер 
			ps.println("привет!"); 
// отправка содержимого буфера клиенту и его очищение 
			ps.flush(); 
			ps.close(); 
		} catch (IOException e) { 
			System.err.println("Ошибка: " + e);
		} finally { 
			try
			{
				if (s != null) 
					s.close();
			}
			catch (IOException e)
			{
				System.err.println("Error:"+e);
			} // разрыв соединения 
		} 
	} 
}
