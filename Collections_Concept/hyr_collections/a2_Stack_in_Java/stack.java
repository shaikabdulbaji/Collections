package a2_Stack_in_Java;

import java.util.Stack;

/*
 * manam stack pai click cheasi press "fn+f3" chestea manki stack ki internal method open iedi e stack 
   kuda vector ni extends cheasidi and e stack java 1.0v lo introduce cheasaru.
   java team stack and vector ni 1.0v lo introduce cheasaru andukea e classes ni legacy classes antaru
   nduku antea collections(1.2v) kana mundea e two classes unai kabati.
   
 * Vector ki Stack ki difference enti antea 
   Vector --> horizantal ga imagine cheasukuntam.
   Stack --> vertical(niluvuga) ga imagine cheasukuntam.
   
   e vector and stack LIFO and FIFO follow aavutai 
   LIFO - Last in First Out (LIFO antea Stack)
   FIFO - First in First Out (FIFO antea Queue)
   
   Example :
   Stack --> LIFO (Last In First Out).
     	|-------| --> Last pentindi last remove chaiyatam.
     	|		|	
     	|		|
     	|		|   
   
   vertical == reverse == stack.
   
   Stack is a class in java which implements the list interface and extends the vector class and also 
   represents the LIFO principle.
   
   vector ki stack ki difference enti antea 
   vector ni manam normal default size tho create chaiyochu lekapothea manaki kavalsina size tho create
   cheasukovachu.
   adea stack lo itea empty ganea create chaiyali denilo default size tho create chaiyaleamu and manaki
   kavalsina size tho kuda create chaiyaleamu.
   
   books.clear(); //Clearing of stack  --> stack clear cheasina tarvata e statement estea
   "System.out.println(books.get(0));" manaki error vastadi "ArrayOutOfBoundException"
   books.clear(); //Clearing of stack  --> stack clear cheasina tarvata e statement estea 
   "System.out.println(books.get(0));" manaki empty stack print iedi.
   
   Deletion of element by index, Deletion of element by name, Updating of element, Retriving of element,
   Clearing of stack, Verification of element evani vector and arraylist lo unavea.
   
   epati daka chepukunavi or matladukunavi ani vector and arraylist kuda unai kani stack lo specality 
   enti antea e stack lo koni special methods unai avi amiti antea --> "push, pop, peek, search".
   push --> push antea amiti antea manam adana stack loki elements ni push chaiyatam (or) simple ga 
   			elements ni add chaiyatanea push antamu.
   peek --> simple ga peek antea edge ani manaki telusu alagea peek antea last element ni console lo 
   			print cheasidi ani ardam.
   pop --> pop antea simple ga remove chaiyatam ani ardam adi remove cheasidi antea last element ni 
   		   remove cheasidi ani ardam.
   search --> search aneadi element yoka index number estadi vertical.
   indexof --> indexof aneadi element yoka index number estadi horizantal.
   
   Empty() and isEmpty() e two methods same aa kada ani teliyali antea vati paki click cheasi press 
   "fn+f3" vatiki internal ga una methos open aavutai.
   Empty() --> size() --> elementCount == 0.
   isEmpty() --> elementCount == 0.
   
   Important points to remember :
   1. What is the default capacity? (Capacity when elements are not added to the list) --> 10
   2. What is the initial capacity? --> 10
   3. Does it allow duplicate elements? --> Yes
   4. Does it allow null values? --> Yes
   5. Does it maintain the insertion order? --> Yes
   6. Does it maintain the sorted order? --> No
   7. Does it offer the random access of elements? --> Yes
   	  but random access of elements ni use cheasukokudadu nduku antea stack ni stack laga use chaiyali
   	  like stack yoka 4methods a use chaiyali get ni use chestea no difference but no use of stack 
   	  apudu vector a create cheasukovachu.
   8. Is it synchronised? --> Yes(deni parent vector synchronized kabati stack kuda synchronized)
   9. What is it good at? --> LIFO(last in first out ki baga use aavutundi).
   
   asal e stack tho manaki use enti ekada use chestamu antea undo and redo operations lo last change ki
   velatam malli return ravatam and back & forward in browsers ela chal unai etc....
   
 */

public class stack {

	public static void main(String[] args) {
		
		Stack<String> books = new Stack<>();
//		books.add("red");
//		books.add("black");
//		books.add("white");
		
		//push and add rendu same stack loki elements ni add chaiyatamea.
		books.push("red"); 
		books.push("black");
		books.push("white");
		books.push("white");
		books.push(null);
		books.push(null);
		
//		books.remove(0); //Deletion of element by index
//		books.removeElement("black"); //Deletion of element by name		
//		books.set(0, "yellow"); //Updating of element
//		System.out.println(books.get(0)); //Retriving of element
//		books.clear(); //Clearing of stack
//		System.out.println(books.contains("black")); //Verification of element
		
//		System.out.println(books.peek()); //edi only last element ni console lo print chestundi.
		
//		System.out.println(books.pop()); //edi only last element ni remove cheasidi.
		
//		System.out.println(books.search("red")); //3 nduku antea reverse lo index estadi reson vertical
//		System.out.println(books.indexOf("red")); //0 nduku antea reverse lo index estadi reson horizantal
		
//		System.out.println(books.search("white"));//1 nduku antea reverse lo index estadi reson vertical
//		System.out.println(books.indexOf("white"));//2 nduku antea reverse lo index estadi reson horizantal
		
//		System.out.println(books.isEmpty()); // --> e method vector nunchi vastundi
//		System.out.println(books.empty()); // --> e method stack nunchi vastundi
		
		System.out.println(books);
	}
}
