package chapter_10_collections;
import java.util.*;

public class DequeRunner { 
	public static void printDeque(Deque<?> d){ 
		for (Object de : d) 
			System.out.println(de + "; "); 
	} 
	public static void main(String[] args) { 
		Deque<String> deque = new ArrayDeque<String>(); 
		deque.add(new String("5")); 
		deque.addFirst("A"); 
		//deque.addLast(new Integer(5));//ошибка компиляции 
		System.out.println(deque.peek()); 
		System.out.println("Before:"); 
		printDeque(deque); 
		deque.pollFirst(); 
		System.out.println(deque.remove(5)); 
		System.out.println("After:"); 
		printDeque(deque); 
	} 
}
