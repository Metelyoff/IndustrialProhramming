package chapter_10_collections.comparators;
import java.util.*;

public class UniqSortMark { 
	public static void main(String[] args) { 
		ArrayList<Student> p = new ArrayList<Student>(); 
		p.add(new Student(3.9f, 52201)); 
		p.add(new Student(3.65f, 52214)); 
		p.add(new Student(3.71f, 52251)); 
		p.add(new Student(3.02f, 52277)); 
		p.add(new Student(3.81f, 52292)); 
		p.add(new Student(9.55f, 52271)); 
		// сортировка списка объектов 
		try { 
			Collections.sort(p, Student.class.newInstance()); 
		} catch (InstantiationException e1) { 
		//невозможно создать объект класса 
			e1.printStackTrace(); 
		} catch (IllegalAccessException e2) { 
			e2.printStackTrace(); 
		} 
		for (Student ob : p) 
			System.out.printf("%.2f ", ob.getMark()); 
		System.out.println("\nnot sorted id");
		for(Student student:p)
			System.out.println(student.getIdStudent());
	
		try { 
			Collections.sort(p, StudentId.class.newInstance()); 
		} catch (InstantiationException e1) { 
		//невозможно создать объект класса 
			e1.printStackTrace(); 
		} catch (IllegalAccessException e2) { 
			e2.printStackTrace(); 
		} 
		System.out.println("sorted id");
		for (Student ob : p) 
			System.out.println(ob.getIdStudent()); 
	} 
}
