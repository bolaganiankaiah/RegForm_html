package collections2;
import java.util.*;
public class linkedlist 
{

	public static void main(String[] args) 
	{
		LinkedList<String>list = new LinkedList<String>();
		
		list.add("Bhargav");
		list.add("Raghavendra");
		list.add(1,"Ravi");
		list.addLast("Praveen");
		list.addFirst("Ram");
		
		System.out.println(list);
		System.out.println("Is list contains Bhargav"+list.contains("Bhargav"));
		System.out.println("First element is"+list.getFirst());
		System.out.println("Last element is"+list.getLast());
		System.out.println("no of elements in the list is"+list.size());
		
		 for(String S:list)
			 System.out.println("Hello "+S+" Welcome to java");
		 
		 list.remove();
		 System.out.println(list);

	}

}
