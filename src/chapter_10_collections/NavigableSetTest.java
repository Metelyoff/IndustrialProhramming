package chapter_10_collections;
import java.util.*;

class NavigableSetTest { 
	public static void main(String[] args) { 
		HashSet<String> city = new HashSet<String>(); 
		city.add("Minsk"); 
		city.add("Mosсow"); 
		city.add("Polotsk"); 
		city.add("Brest");
		System.out.println("hashset city:");
		for(String c:city){
			System.out.println(c);
		}
		System.out.println();
		NavigableSet<String> ns = new TreeSet<String>(city); 
		System.out.println("All: " + ns); 
		System.out.println("First: " + ns.first()); 
		System.out.println("Between Minsk and Polotsk: " 
						   + ns.subSet("Minsk","Polotsk")); 
		System.out.println("Before Minsk: " 
						   + ns.headSet("Minsk")); 
		System.out.println("After Minsk: " 
						   + ns.tailSet("Minsk",false)); 
	} 
}
