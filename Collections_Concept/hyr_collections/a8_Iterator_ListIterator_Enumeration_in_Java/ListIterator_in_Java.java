package a8_Iterator_ListIterator_Enumeration_in_Java;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

/* 
 * ListIterator - Interface
   ListIterator is introduced for iterating only List type of collection objects 
   ListIterator = Legacy classes + New classes. (ArrayList, LinkedList, Vector, Stack)
   rendu classes ni iterate chestundi.
   ListIterator is works in "Bi direction", read and write purpose.
   
   
   
 * Map ki sambandinchina classes ki mothaniki e iterator aneadi pani chaiyadu, e iterator kavali manaki 
   danitho map lo pani undi antea ela vadukovachu.
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("India", 500);
		hm.put("SriLanka", 700);
		hm.put("London", 1000);
		
		hm.keySet().iterator(); --> edi keys ni iterate chestundi
		hm.values().iterator(); --> edi values ni iterate chestundi
		hm.entrySet().iterator(); --> edi keys and values ni iterate chestundi
   
 * e Iterator koni methods unai avi enti antea   
   ie.hasNext(); --> edi em chestundi antea next element untea boolean ni return chestundi.
   element untea "true" return chestundi.
   ie.next(); --> edi em chestundi antea aa element ni get chestundi (or) retrive chestundi.
   
   while(ie.hasNext())
   {
		ie.next();
    	ie.remove();
   }
   e paina statement estea nai elements vaka dani tarvata vakati remove aavutai.
   adea vaka vaka element remove chaiyali antea 
   ie.next();
   ie.remove();
   ela estea next() lo element get cheasidi, remove() lo get cheasina element romove cheasidi.
   ie.next();
   ie.remove();
   ela estea next() lo element get cheasidi, remove() lo get cheasina element romove cheasidi.
   
 */

public class ListIterator_in_Java {

	public static void main(String[] args) {
		/*
		//ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		al.add(85);
		al.add(45);
		al.add(98);
		
		ListIterator<Integer> li = al.listIterator();
		
		while(li.hasNext()) // --> edi forward direction ki
		{
			System.out.println(li.next());
		}
		
		li.add(105); // --> edi element add chaiyataniki
		System.out.println();
		
		while(li.hasPrevious()) // --> edi backward direction ki
		{
			System.out.println(li.previous());
		}
		
		li.remove(); // --> edi element remove chaiyataniki
		System.out.println();
		
		System.out.println(al);
		*/
		
		
		//Vector
		Vector<Integer> al = new Vector<>();
		al.add(85);
		al.add(45);
		al.add(98);
		
		ListIterator<Integer> li = al.listIterator();
		
		while(li.hasNext()) // --> edi forward direction ki
		{
			System.out.println(li.next());
		}
		
		li.add(105); // --> edi element add chaiyataniki
		System.out.println();
		
		while(li.hasPrevious()) // --> edi backward direction ki
		{
			System.out.println(li.previous());
		}
	
		li.remove(); // --> edi element remove chaiyataniki
		System.out.println();
		
		System.out.println(al);		
		
	}

}
