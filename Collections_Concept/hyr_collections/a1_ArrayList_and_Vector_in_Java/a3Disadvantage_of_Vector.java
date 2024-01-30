package a1_ArrayList_and_Vector_in_Java;

import java.util.Arrays;
import java.util.Vector;

/*
 * Asal "vector" aneadi collections kana mundea undi java lo, vector vaka individual concept, deni java
   team java "1.0v" lonea introduce cheasaru.
   
   e vector anea concept kinda echinatu manam object create cheasi run chestea kinda vachinatu errors 
   vastunai andar devlopers ki evani collect cheasi deni overcome chaiyataniki "collections" anea concept 
   ni introduce cheasaru java "1.2v" lo.
   
   malli elagea different different developers vakalaki telikuda vakalu different type of objects create
   chestunaru malli issues vastunai dani overcome chaiyataniki "Generics" anea concept ni introduce 
   cheasaru java "1.5v" lo.
   ex : Vector<Integer> v1 = new Vector<Integer>();
   malli aa "Integer" place lo primitive type of data ni send chaiyaleamu like int,string etc....
   
   manalni interview lo main ga adigea question, asal e generica aneadi nduku introduce cheasaru and asal
   e generics lo only non-primitive data type nea nduku pass chestam, primitive data type ni nduku pass
   chaiyamu.
   generics nduku introduce cheasaru aneadi manam paina chepukunam, danilo non-primitive data type nea 
   nduku pass chestam antea non-primitive data type ki object create chaiyagalam but primitive data type 
   ki object create chaiyaleamu.
   asal e object nduku antea, every collection is a combination of objects.
   manam aditea element element antunamo aa element internal ga collection ki object.
   
   asal main ga generics create cheasinapudu
   Vector<Integer> v1 = new Vector<Integer>(); --> ela estanm generics <> lessthan and greaterthan 
   brackets lo, ela koni rojula tarvata "Integer" aneadi rendu chotla nduku echeadi vaka chota estea 
   chalu kada ani developers java team ki complaint echaru, dani java team valu modify cheasi ela apply
   cheasukovachu ani cheparu --> Vector<Integer> v1 = new Vector<>(); 
   Integer aneadi manam second brackets lo echina em kadu evakuna em kadu.
   denitho benifit amiti antea Integer estea integer values a pass chaiyali verok values estea error 
   vastadi. String estea string values a pass chaiyali verok values estea error vastadi.
   
   1. Duplicates ni allow chestundi.
   2. Null values ni allow chestundi.
   3. Inerstion order undi (antea manam echina order lonea execute aavutundi)
   
   Important points to remember :
   1. What is the default capacity? (Capacity when elements are not added to the list) --> 10
   2. What is the initial capacity? --> 10
   3. Does it allow duplicate elements? --> Yes
   4. Does it allow null values? --> Yes
   5. Does it maintain the insertion order? --> Yes
   6. Does it maintain the sorted order? --> No
   7. Does it offer the random access of elements? --> Yes(manaki kavalsina value retrive cheasukotam)
   8. Is it synchronised? --> Yes(vaka dani tarvata vakati ki answer cheasidi)
   9. What is it good at? --> multi threading, data is go on incresing apudu edi use chaiyatam good.
   
   Note : insertion order unter sorted order undadu, sorted order untea insertion order undadu.
   simple ga 
   insertion order yes itea sorted order no aavutundi.
   insertion order no itea sorted order yes aavutundi.
   
   
 */


public class a3Disadvantage_of_Vector {
	
	public static void main(String[] args) {
		/*
		Object[] arr = new Object[] { 1, 2, 3, 4, 5, 6, 7 }; 
		Vector v1 = new Vector(Arrays.asList(arr));
		v1.add("shaik");
		
		int sum=0;
		for(int i=0; i<v1.size(); i++)
		{
			sum = sum + (Integer)v1.get(i);
		}
		*/
		/*
		 * paina program manam run chestea e error vastadi, manaki telikuna evaro vaka string object 
		   create cheasaru manaki telikunda run chestea e error vastadi.
		   java.lang.String cannot be cast to class java.lang.Integer
		 */
		
//		System.out.println(v1);
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
		
		System.out.println("=======================================");
		
		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(2);
		v2.add(3);
		v2.add(null);
		v2.add(null);
		v2.add(3);
		v2.add(2);
		
		System.out.println(v2);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
	}

}
