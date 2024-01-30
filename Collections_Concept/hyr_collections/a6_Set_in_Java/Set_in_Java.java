package a6_Set_in_Java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set is an interface and it is a part of collections framework.
 
 * epati daka ado technical ga chepukunam and matladukunam, epudu asal functional ga chepukovali antea 
   java team asal Set aneadi nduku introduce cheasindi antea, collections lo unavi ani "Data Structures" 
   a alagea e Set kuda danilo vaka part antea e Set vaka data structure, just like other data structures 
   data ni store cheasukotaniki e set aneadi kuda introduce cheasindi.
   
 * e data structures ani multiple data ni store cheasukuntai, itea e set ni special ga nduku 
   matladukuntunam List and Queue aneadi a purpose kosam implement cheasaro aa purpose aneadi saripovatam
   leadu ana mata deni kosam manam vera inkoka data structure kavalsochindi danikosam Set anea interface 
   ni java introduce cheasindi.
   
 * List aneadi multiple type of data ni store cheasukoni different different type of operations cheasuko
   taniki use chestam.
   Queue aneadi FIFO operations kosam use chestamu.
   
 * Difference enti antea 
   List and Queue aneavi rendu duplicates ni allow chestai.
   "Set aneadi duplicates ni allow chaiyadu, unique data ni store cheasukuntundi".
   
==========================================================================================================

 * HashSet edi java 1.2v lo introduce chesaru, it implements Set interface.
  
 * "ArrayList" aneadi internal ga data ni "arrays" lo store cheasukuntundi algea "LinkedList" aneadi 
   internal ga "Node" rupam lo store cheasukuntundi alagea "HashSet" aneadi internal ga data ni ekada 
   store cheasukuntundi antea "HashMap" lo store chestundi.
   HashSet --> HashMap --> Array of Nodes(Key, value)
   ekada "Hash" enti antea internal ga hashing anea vaka mechanism ie hashcode aneadi vakati link iedi 
   aa element ki denki key ki internal ga link iedi.
   asal hashset aneadi internal ga hashmap ni implement chestundi kani hashmap lo key and value ani rendu
   untai but hashset lo elements echeatapudu keys a estamu kani values evamu aa values place lo internal 
   or default ga dummy objects tisukuntundi.
   eg : new Object(); --> dummy Objects.
   
 * asal HashSet ki internal ga HashMap a nduku use chestunam vereadi like arrays kani or nodes kani use 
   cheasukovachu kada antea HashMap lo key aneadi unique aa uniquenes ni reuse cheasukotaniki HashSet
   ki internal ga HashMap nea use cheasaru.
   
 * e internal HashMap ala chustamu antea 3 ways lo chustamu :
   1. HashSet() mida mousehouver cheasi press "fn+f3" then it will redirect to HashMap.
   2. hs.add(5); edi echamu kada elements add chaiyataniki aa add pai mousehover cheasi press "fn+f3" 
      then it will redirect to position then again mousehover to position and press "fn+f3" then it will
      redirect to dummy object like new Object(); --> dummy Objects.
   3. By debug, toggle breakout point object kada peti debug mode lo run chestea ardam iedi HashMap 
      aneadi
   
=========================================================================================================

 * LinkedHashSet ki HashSet ki una major difference enti antea
   HashSet internal ga hashing jarigi elements aneavi random ga print aavutai console lo.
   LinkedHashSet lo itea "insertion order" untundi antea manam elements ala echamo alanea console lo 
   print aavutai.

 * "LinkedHashSet" aneadi internal ga data ni ekada store cheasukuntundi antea "LinkedHashMap" lo store
   chestundi.
   LinkedHashSet --> LinkedHashMap --> Link of Nodes(Key, value)
   LinkedHashSet lo elements echeatapudu keys a estamu kani values evamu aa values place lo internal 
   or default ga dummy objects tisukuntundi.
   eg : new Object(); --> dummy Objects.
   
 * e internal HashMap ala chustamu antea 3 ways lo chustamu :
   1. LinkedHashSet() mida mousehouver cheasi press "fn+f3" then it will redirect to super() method then
      aa super mida mousehouver cheasi press "fn+f3" then it will redirect to LinkedHashMap.
   2. hs.add(5); edi echamu kada elements add chaiyataniki aa add pai mousehover cheasi press "fn+f3" 
      then it will redirect to position then again mousehover to position and press "fn+f3" then it will
      redirect to dummy object like new Object(); --> dummy Objects.
   3. By debug, toggle breakout point object kada peti debug mode lo run chestea ardam iedi HashMap 
      aneadi

=========================================================================================================
 
 * LinkedHashSet ki and HashSet ki and TreeSet ki una major difference enti antea
   HashSet internal ga hashing jarigi elements aneavi random ga print aavutai console lo.
   LinkedHashSet lo itea insertion order untundi antea manam elements ala echamo alanea console lo print
   aavutai.
   TreeSet aneadi asal "Sorted Order"(small to big) kosam manam elements ala echina console lo small to 
   big numbers a print aavutai console lo.
 
 * "TreeSet" aneadi internal ga data ni ekada store cheasukuntundi antea "TreeMap" lo store
   chestundi.
   TreeSet --> TreeMap --> Binary Tree
   
 * e internal TreeMap ala chustamu antea 3 ways lo chustamu :
   1. TreeSet() mida mousehouver cheasi press "fn+f3" then it will redirect to TreeMap.
   2. hs.add(5); edi echamu kada elements add chaiyataniki aa add pai mousehover cheasi press "fn+f3" 
      then it will redirect to position then again mousehover to position and press "fn+f3" then it will
      redirect to dummy object like new Object(); --> dummy Objects.
   3. By debug, toggle breakout point object kada peti debug mode lo run chestea ardam iedi TreeMap 
      aneadi 
      
=========================================================================================================
 * Summary :
   1. Set aneadi unique data elements ni store cheasukotaniki introduce cheasina vaka kotha data 
      structure.
   2. manam duplicate data ni add cheasina em kadu compile time error em radu kani run time lo aa 
      duplicate elements ni skip cheasidi.
   3. Set yoka internal implementation motham Map a untundi.
      Set --> Map --> Array of Entries(Key, value) 
      HashSet --> HashMap --> Array of Nodes(Key, value)
      LinkedHashSet --> LinkedHashMap --> Link of Nodes(Key, value)
	  TreeSet --> TreeMap --> Binary Tree
   4. Set lo null values pass chaiyocha antea yes ana wrong a no ana wrong a, nduku antea
      HashSet and LinkedHashSet will allow null vales.
      TreeSet will not allow null values.

 */

public class Set_in_Java {

	public static void main(String[] args) {

		//HashSet
//		Set<Integer> s = new HashSet<>(); // (or)
//		HashSet<Integer> hs = new HashSet<>();
		
//		LinkedHashSet<Integer> hs = new LinkedHashSet<>(); //(Or)
//		Set<Integer> hs = new LinkedHashSet<>();
		
		TreeSet<Integer> hs = new TreeSet<>(); //(Or)
//		Set<Integer> hs = new TreeSet<>();
		
		hs.add(5);
		hs.add(10);
		hs.add(85);
		hs.add(95);
		hs.add(95);
		hs.add(10);
		hs.add(85);
		hs.add(null);
		
		System.out.println(hs);
		/*
		//Removal of elements from HashSet --> vitiki index number kadu element name use chaiyali.
		System.out.println(hs.remove(85));
		System.out.println(hs.remove(10));
		System.out.println(hs.remove(1));
				
		//Verification of elements in HashSet
		System.out.println(hs.contains(5));
		System.out.println(hs.contains(1));
		
		//Ani elements print aavali antea
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		
		System.out.println(hs.size());
		*/
		
		//TreeSet ki koni special methods unai
//		System.out.println(hs.first()); //--> first element console lo print cheasidi.
//		System.out.println(hs.last()); //--> last element console lo print cheasidi.
		
//		System.out.println(hs.pollFirst()); //--> first element ni remove chestundi.
//		System.out.println(hs.pollLast()); //--> last element ni remove chestundi.
		
//		System.out.println(hs.subSet(2, 50)); //-->edi vaka subset create chaiyataniki
//		System.out.println(hs.subSet(2, 50).remove(5)); //-->edi aa subset lo element remove chaiyatniki
		
//		System.out.println(hs.descendingSet()); //-->small to big(default) kadu big to small print iedi
		
		System.out.println(hs);
		
	}

}
