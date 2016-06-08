package chapter_10_collections;
import java.util.*;

/*
 Удаление и добавление элементов для такой коллекции представляет собой 
 ресурсоемкую задачу, поэтому объект ArrayList<E> лучше всего подходит для 
 хранения неизменяемых списков.
*/

public class DemoGenericArrayList
{
	public static void main(String args[]) { 
		ArrayList<String> list = new ArrayList<String>(); 
// ArrayList<int> b = new ArrayList<int>(); // ошибка компиляции 
		list.add("Java"); 
		list.add("Fortress"); 
		String res = list.get(0);/* компилятор “знает” 
		 тип значения */ 
// list.add(new StringBuilder("C#")); // ошибка компиляции 
// компилятор не позволит добавить “посторонний” тип 
		System.out.print(list); 
	}
}
