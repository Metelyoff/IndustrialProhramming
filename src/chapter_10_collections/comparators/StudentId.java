package chapter_10_collections.comparators;
import java.util.*;

public class StudentId implements Comparator<Student> { 
	public int compare(Student one, Student two) { 
		return two.getIdStudent() - one.getIdStudent(); 
	} 
}
