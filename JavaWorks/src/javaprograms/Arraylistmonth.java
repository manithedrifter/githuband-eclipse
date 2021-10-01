package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Arraylistmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		way 1:
		ArrayList<String> sc2 = new ArrayList<String>(); 
		sc2.add("mom");
		sc2.add("mother");
		sc2.add("dad");
		sc2.add("father");
		sc2.add("dad");
		
//		Get an element in array list:
		System.out.println(sc2.get(2));
		
//		Get an index position in array list
		System.out.println(sc2.indexOf("dad"));
		
//		Get last index position in array list
		System.out.println(sc2.lastIndexOf("dad"));
//		Copying one array list to another array list
		List<String> sk=new ArrayList<String>();
		sk.addAll(sc2);
//		Delete all element in an array list
//		Remove one element in an array list 
//		Inserting a null element in array list
//		Replacing an element in an array list
//		Verifying an array list is empty or not
		
		
		
		
		
		
//		way 2:
		
		List<String> s =Arrays.asList("mon", "tues", "wed");
		
//iteration using foreach loop
		
		for (String string : sc2) {
			if (string.length() ==3 )
				System.out.println(string);
			else
				for (String string2 : s) {
					
					System.out.println(string2);
				}
			
		}
		
		ListIterator<String>listIterator=sc2.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
		//iteration using for loop
		for (int i = 0; i < s.size(); i++) {

			int babi = s.get(i).length();
			String abi = s.get(i);
			if (babi > 3) {
				System.out.println(abi);
			}

		}

	}

}
