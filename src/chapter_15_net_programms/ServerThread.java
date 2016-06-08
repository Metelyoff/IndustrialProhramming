package chapter_15_net_programms;
import java.io.*;
import java.net.*;

class ServerThread extends Thread { 
	private PrintStream os;//передача 
	private BufferedReader is;//чтение 
	private InetAddress addr;//адрес клиента 

	public ServerThread(Socket s) throws IOException { 
		os = new PrintStream(s.getOutputStream()); 
		is = new BufferedReader( 
			new InputStreamReader( 
				s.getInputStream())); 
		addr = s.getInetAddress(); 
	} 
	public void run() { 
		int i = 0; 
		String str; 
		try { 
			while ((str = is.readLine()) != null) { 
				if ("PING".equals(str)) 
					os.println("PONG "+ ++i); 
				System.out.println("PING-PONG" + i 
								   + " with " + addr.getHostName()); 
			} 
		} catch (IOException e) { 
//если клиент не отвечает, соединение с ним разрывается
			System.out.println("Disconnect"); 
		} finally { 
			disconnect();//уничтожение потока 
		} 
	} 
	public void disconnect() { 
		try { 
			System.out.println(addr.getHostName() 
							   + " disconnected"); 
			os.close(); 
			is.close(); 
		} catch (IOException e) { 
			e.printStackTrace(); 
		} finally { 
			this.interrupt(); 
		} 
	} 
}
