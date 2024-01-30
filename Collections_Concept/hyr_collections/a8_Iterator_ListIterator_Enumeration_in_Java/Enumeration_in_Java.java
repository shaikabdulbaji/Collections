package a8_Iterator_ListIterator_Enumeration_in_Java;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

/*
 * Iterator and ListIterator and Enumeration these three are used iteration of elements.
 
 * Asal e Iterator and ListIterator and Enumeration nduku accessing of elements and printing of elements
   in console anthea ga.
   for-loop and foreach-loop undaga evi nduku antea e three kuda vaka type of accessing of elements.
 
 * Enumeration - Interface
   Introduced for iterating the Legacy collection objects 
   Legacy classes antea 1.0v intoduce cheasinavi - HashTable, Stack, Vector, Dictionary, Properties
   1.2v nunchi introduce cheasina classes ani New classes.
   Enumeration is also a Legacy interface.
   Enumeration aneadi almost foreach-loop ki equal ga untundi.
   hasMoreElements() --> edi em chestundi antea next element untea boolean ni return chestundi.
   element untea "true" return chestundi.
   element lekapote "false" return chestundi.
   en.nextElement() --> edi em chestundi antea aa element ni get chestundi (or) retrive chestundi.
   Enumeration aneadi "only forward direction" lo move iedi previous anea option undadu.
   
 * manam adana Enumeration ni iterater la use chaiyali antea
   p.elements().asIterator(); --> ela use cheasukovachu.
   
 */

public class Enumeration_in_Java {

	public static void main(String[] args) {
		/*
		//Enumeration - Interface
		//Vector
		Vector<String> v = new Vector<>();
		v.add("apple");
		v.add("banana");
		v.add("orange");
		
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		//Stack
		Stack<String> v = new Stack<>();
		v.add("apple");
		v.add("banana");
		v.add("orange");
		
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		//Hashtable
		Hashtable<String, Integer> ages = new Hashtable<>();
		ages.put("India", 500);
		ages.put("SriLanka", 700);
		ages.put("London", 1000);
		
		Enumeration<Integer> e = ages.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		*/
		//Properties
		Properties p = new Properties();
		p.setProperty("url", "localhost");
		p.setProperty("username", "shaik");
		p.setProperty("password", "abdul");
		
		Enumeration<Object> e = p.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
