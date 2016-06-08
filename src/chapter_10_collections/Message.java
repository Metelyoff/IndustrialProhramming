package chapter_10_collections;

public class Message implements Comparable<Message> { 
	private StringBuilder str; 
	private int idSender; 

	public Message(StringBuilder s, int id) { 
		super(); 
		this.str = s; 
		idSender = id; 
	} 
	public String getStr() { 
		return str.toString(); 
	} 
	public int getId() { 
		return idSender; 
	} 
	public int compareTo(Message a0) { 
		return (idSender - a0.getId()); 
	} 
}
