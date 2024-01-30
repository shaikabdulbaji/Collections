package a4_Map_in_Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map is a interface, it s provided by collections framework.
 
 * map aneadi asal nduku vachindi antea list or arraylist or linkedlist or vector or stack vitilo manam
   kavalsinani elements add cheasukovachu e link ki sambandinchinai ani konitika very very good but vitilo
   ani elements ina add cheasukovachu kada ala ani naku kavalsina element 10,000th element lo undi apudu
   for-loop peti prathi element iterate cheasi apudu manam reesult bayataki tiyali denilo loss enti antea
   10,000 times iterate aavali apudu bayataki vastadi result deni valla performance issue vastadi.
   
   vitanitini overcome chaiyataniki map ni introduce cheasaru deni key and values rendu untai, aa value 
   lo manam 10,000 number echamu anuko easy ga retrive cheasidi (or) key echamu anuko easy ga retrive 
   cheasidi edi special map lo.
   
 * asal map aneadi vaka interface, kani mana doubt enti antea asal map aneadi interface ga nduku class 
   laga introduce chaiyochu kada antea. edi kuda manaki manchi doubt a, e interface anea dani multiple 
   classes implement cheasukovachu kada, adana vaka value ni nenu get cheasukovali antea something nuvu 
   reference ga pass chestea aa value aneadi vastundi anea vaka mechanism tho manki interfce aneadi 
   create cheasaru edi manaki main principle. manaki koni chotla performance kavali koni chotla 
   multi-threading kavali aa performance kavali ana chota performance increase cheasukovachu, 
   multi-threading chota naku performance vadu anukuntea data-structures create cheasukovachu, elanti
   requirements anitini satisfy cheasukotaniki edi koni classes ni implement chestundi.
   
   summary :
   list aneadi em chestundi elements ni store cheasukuntundi index positions ni base cheasukoni and 
   retrive cheasukunea tapddu kuda index positions ni base cheasukoni retrive cheasukovali antea adana 
   index number ni nenu pampistea aa value aneadi get chestundi. kani koni situations lo edi manaki use
   aavadu anamata elantapudu manam key (or) value ni ado vaka dani pampistea aa element aneadi retrive 
   aavali e key and value concept a map concept. 
   and e map aneadi interface ganea nduku vachindi class ga nduku raleadu antea aa interface lo kuda manki
   different requirements ravachu antea e requirements lo sub requirements undochu. ela key pampistea 
   value ni get cheasukovatam multi-threaded environment lo chaiyatam and non multi-threaded environment 
   lo chaiyatam antea single threaded environment lo chaiyatam so ala different different requirements 
   aneaviunai anamata inerstion order lo petukovatam and order lekunda petukovatam and sort cheasi 
   petukovatam so elanti vati kosam map ki interface aneadi introduce cheasaru and aa interface ni 
   implement different different classes chestai, aa implentation lo manaki kavalsinatu ga implement
   cheasukovachu. so denikosam map ni interface la introduce cheasaru.
   
 * Major Operations : (evali interface ki verthinchavu nduku antea interfaces ki objects create 
   chaiyaleamu ga andukani map lo internal ga undea classes untai kada vatiki verthistai vatiki manam
   object create cheasukovachu)
   Creation of a map
   Addition of elements into the map
   Retrieval of keys from the map
   Retrieval of values from the map
   Deletion of elements from the map
   Verification of keys in the map
   Verification of values in the map
   Updation of elements in the map
   
   List<String> l1 = new ArrayList<>(); --> ekada only one single value pass chestunam kabati "String"
   ani echamu Generics lo.
   Map<Integer, String> m1 = new HashMap<>(); --> ekada key and value ani rendu parameters ni pass 
   chestunam kabati "Integer, String" ani echamu Generics lo.
   
   Keyset() --> indulo keys untai.
   values() --> indulo values untai.
   EntrySet<Integer, String> --> indulo keys and values rendu untai.
   
***Note :
   Map<Integer, String> m = new HashMap<>();
   Map<Integer, String> m = new Hashtable<>();
   Map<Integer, String> m = new TreeMap<>();
   Map<Integer, String> m = new LinkedHashMap<>();
 
   HashMap() (or) Hashtable() (or) TreeMap() (or) LinkedHashMap() --> vitilo adi use cheasina em 
   difference undadu ani methods e paina una map yoka classes ki. 
   vitilo main difference enti antea internal implementation different ga untundi.
 
 */

public class Map_in_Java {

	public static void main(String[] args) {

//		List<String> l1 = new ArrayList<>();  
		
//		Map m0 = new HashMap(); // --> Generics leakunda kuda vadukovachu
		
		//Creation of Map
//		Map<Integer, String> m = new HashMap<>();
//		Map<Integer, String> m = new Hashtable<>();
//		Map<Integer, String> m = new TreeMap<>();
		Map<Integer, String> m = new LinkedHashMap<>();
		
		//Addition of Elements into Map
		m.put(1, "sk1");
		m.put(2, "sk2");
		m.put(500038, "Hyderabad");
		m.put(603130, "Chennai");
		m.put(12345, "Delhi");
		
		//Retrival of "Keys" from the Map --> keys kavali antea "keySet()" anea method use chestamu.
		Set<Integer> keys = m.keySet();
		
		//Printing kosam for-each loop
		for (Integer key : keys) {
			System.out.println(key);
		}

		System.out.println("-------------------------------------");
		
		// Retrival of "Values" from the Map --> Vslues kavali antea "values()" anea method use chestamu.
		Collection<String> values = m.values();

		// Printing kosam for-each loop
		for (String value : values) {
			System.out.println(value);
		}
		
		System.out.println("--------------------------------------");
		
		//key ni pass cheasi values ni retrive chaiyam (edea employess anea example lo kuda vadukovachu)
		System.out.println(m.get(500038));
		
		//values ni pass cheasi key ni retrive chaiyam
		Set<Integer> keys1 = m.keySet();
		for (Integer key : keys1) {
			System.out.println(key + " >>>>>>> " + m.get(key));
		}
		
		System.out.println("--------------------------------------");
		
		//Entire Map ni kuda print chaiyavachu
		System.out.println(m);
		
		System.out.println("--------------------------------------");
		
		//Deletion of elements from the Map
		m.remove(1);
		System.out.println(m);
		
		System.out.println("--------------------------------------");
		
		//Verification of keys in the map
		System.out.println(m.containsKey(12345)); //correct di
		System.out.println(m.containsKey(123)); //wrong di
		
		//Verification of keys in the map
		System.out.println(m.containsValue("sk2")); //correct di
	    System.out.println(m.containsValue("sk")); //wrong di
		
		System.out.println("--------------------------------------");
		
		//Updation of elements in the map
//		System.out.println(m);
//		m.put(12345, "Narasaraopet"); // --> Delhi poi Narasaraopet update iedi
//		System.out.println(m);
		
		//same as variable update
		int i = 5;
		i = 10;
		System.out.println(i);
		
		//e key(12345) aneadi mana map lo lekapotea update iedi untea skip iopd
//		System.out.println(m);
//		m.putIfAbsent(12345, "Narasaraopet"); // --> Delhi poi Narasaraopet update iedi
//		System.out.println(m);
		
		//inko type of update by replace
		System.out.println(m);
		m.replace(12345, "Guntur");
		System.out.println(m);
		
		System.out.println("--------------------------------------");
		
		//Manaki map lo ani elements unaiyo teluskovali antea
		System.out.println(m.size());
		
		System.out.println("--------------------------------------");
		
		//Map ni clear chaiyali antea
//		m.clear();
//		System.out.println(m);
		
		System.out.println("--------------------------------------");
		
		Set<Entry<Integer,String>> entries = m.entrySet();
		for (Entry<Integer, String> entry : entries) 
		{
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ">>>>>>" +value);
		}
		
		System.out.println("--------------------------------------");
		
		
		
	}

}
