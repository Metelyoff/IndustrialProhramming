package chapter_10_collections;
import java.util.*;

public class UncheckCheckArrayList
{
	public static void main(String args[]) { 
		ArrayList list = new ArrayList(); 
		list.add(71); 
		list.add(new Boolean("TruE")); 
		list.add("Java 1.6.0"); 

// требуется приведение типов 
		int i = (Integer)list.get(0); 
		boolean b = (Boolean)list.get(1); 
		String str = (String)list.get(2); 
		for (Object ob : list) 
			System.out.println("list " + ob); 

		ArrayList<Integer> s = new ArrayList<Integer>(); 
		s.add(71); 
		s.add(92); 
// s.add("101");// ошибка компиляции: s параметризован 
		for (Integer ob : s) 
			System.out.print("int " + ob); 
	}
}
