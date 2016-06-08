package chapter_10_collections;
import java.util.*;
import java.io.*;

public class DemoHashSet { 
	public static void main(String[] args) { 
		HashSet<String> words = new HashSet<String>(100); 
		// использовать коллекции LinkedHashSet или TreeSet 
		long callTime = System.nanoTime(); 
		try { 
			BufferedReader in = 
				new BufferedReader( 
				new FileReader("/storage/sdcard0/AppProjects/WorkSpaceGit/IndustrialProhramming/src/chapter_10_collections/set.txt")); 
			String line = ""; 
			while ((line = in.readLine()) != null) { 
				StringTokenizer tokenizer = 
					new StringTokenizer(line , 
										" (){}[]<>#*!?.,:;-\'\"/"); 
				while (tokenizer.hasMoreTokens()) { 
					String word = tokenizer.nextToken(); 
					words.add(word.toLowerCase()); 
				} 
			} 
		} catch (IOException e) { 
			System.err.println(e); 
		} 
		Iterator<String> it = words.iterator(); 
		while (it.hasNext()) 
			System.out.println(it.next()); 
		long totalTime = System.nanoTime()- callTime; 
		System.out.println("различных слов: " + words.size() 
						   + ", " + totalTime + " наносекунд"); 
	} 
}
