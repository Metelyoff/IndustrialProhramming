package chapter_10_collections;
import java.util.*;

public class DemoTreeSet
{
	public static void main(String[] args) { 
		ArrayList<String> c = new ArrayList<String>(); 
		boolean b; 
		for (int i = 0; i < 6; i++) 
			c.add((int) (Math.random() * 71) + "Y "); 
		System.out.println(c + "список"); 
		TreeSet<String> set = new TreeSet<String>(c); 
		System.out.println(set + "множество"); 
		b = set.add("5 Element"); // добавление(b=true) 
		b = set.add("5 Element"); // добавление(b=false) 

		// после добавления 
		System.out.println(set + "add"); 
		System.out.println(set.comparator()); //null !!! 

		// извлечение наибольшего и наименьшего элементов 
		System.out.println(set.last() + " " 
						   + set.first()); 
	}
}
