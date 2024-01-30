package a1_ArrayList_and_Vector_in_Java;

import java.util.Arrays;
import java.util.Vector;

/*
 * Manam vaka hotel example cheapukunam, adi ala antea vaka hotel undi danlo 10seating undi kani
   aa hotel ki customers akuva ipoyaru dani capacity penchataniki verea hotel tisukunam danilo
   20seating undi kani aa hotel ki customers akuva ipoyaru dani capacity penchataniki verea hotel
   tisukunam danilo 40seating undi.
   kavalantea e example ni observe chiayataniki screenshot ki refer chaiyandi.
   
   ekada main ga hotel antea vaka "Array" ani ardam.
   "Vector" and "ArrayList" internal ga Arrays ni implement chestai.
   kani manaki Arrays tho vaka disadvantage undi adi enti antea fixed in size.
   
   epudu for example Vector lo size aneadi increse kavali antea 100% increse iedi.
   vector --> initial ga 10 untea tarvata 20, 40,80, 160 etc... ala 100% increse iedi.	
   epudu for example ArrayList lo size aneadi increse kavali antea 50% increse iedi.  
   ArrayList --> initial ga 10 untea tarvata 15, 15+7.5=22, 22+11=33, 33+16.5=49 etc... ala 50% 
   increse iedi.
   
   First Vector antea enti adi vaka class dani manam use cheasukovali antea aa Vector anea class ki 
   object create chaiyali.
   Vector v1 = new Vector();
   asal e arraylist and vector internal ga arrays anea concept nea implement cheasidi ani chepukunam, adi
   implement ienda leada ani chudataniki print statement estea ardam iedi.
   System.out.println(v1);
   
   
   
   asal e vector lo manam theoritical ga chepukunatu vector default size vacheasi 10 manam 11th element 
   add chestea dani default size 10 kastha 20 ki aavutundo leado chudali antea manam debug chaiyali, 
   ala debug chaiyali antea vaka chota toggle breakout point petukoni "fn+f6" press chestu potea manaki
   ardam iedi, aa object yoka reference variable v1 undi kada akada mouse pointer place chaiyali debug 
   time lo apudu manaki ardam iedi.
   
   manam ela debug chaiyatam kastha pedha process edantha leakunda manam size and capacity evi vadukundam.
   Size --> no.of elements present in the list.
   Capacity --> Array capacity (or) internal ga create ina array capacity.
   
   adea adana two vectors merge or add chaiyali anuko, two types lo merge chiyavachu.
   1. for-loop.
   2. addAll() method.
   
   ====================================================================================================
   default capacity of vector is 10, kani manaki default size 20 tho kavali antea ele chaiyali 
   observe v4.
   Vector v4 = new Vector(); --> ela estea default size 10.
   Vector v4 = new Vector(20); --> ela estea default size 20.
   Vector v4 = new Vector(200); --> ela estea default size 200.
    
    
   
 */

public class a2Operations_of_vector {

	public static void main(String[] args) {

	   Vector v1 = new Vector();		
	   v1.add("shaik");
	   v1.add("abdul");
	   v1.add(0, "baji"); 
	   
	   Vector v2 = new Vector();
	   v2.add("sk");
	   v2.add("ab");
	   v2.add("ba");
	   v2.add("ba");
	   
	   Vector v3 = new Vector();
	   v3.add("ba");
	   v3.add("ab");
	   v3.add("sk");
	   
//	   for(int i=0; i<v2.size(); i++)
//	   {
//		   v1.add(v2.get(i));
//	   }
	   
	  //v1.addAll(v2);
	   v1.addAll(0,v2); //particular position lo add chaiyali antea ela index number vadtam.
	  
	   System.out.println(v1);
	   /*
	 //For Retriving we use get() method
	  System.out.println(v1.get(5));
	  
	//For Removing (or) Deleting we use remove() method
	  v1.remove(4); //related to index position
	  v1.remove("shaik"); //related to object
	  v1.removeAll(v2); //related to removing all
	  v1.clear(); //related to clear all objects and returing empty array
	  System.out.println(v1);
	  
	   
	 //For Verification we use contains() method
	   System.out.println(v1.contains("shaik")); //contains single element
	   System.out.println(v1.containsAll(v3)); //contains one collection
	   System.out.println(v2.containsAll(v3)); //contains one collection
	   
	   
	   
	 //For Updation we use set() method
	   System.out.println(v1);
	   v1.set(0, "satish");
	   
	   System.out.println(v1);
	   System.out.println(v1.get(1)); //manaki particular position lo element kavali antea get(index)
	   System.out.println(v1.indexOf("ba")); //edi adana element yoka index kavali antea.
	   System.out.println(v1.lastIndexOf("ba")); //edi duplicate element untea last index kavali antea
	   System.out.println(v1.firstElement()); //list lo first element kavali antea
	   System.out.println(v1.lastElement()); //list lo last element kavali antea
	   
	   Object[] arr = v1.toArray(); //edi manama echina elements array ki covert chaiyataniki
	   System.out.println(Arrays.toString(arr)); 
	   */
	   
	   System.out.println("--------------------------------------------");
	   
	   //koni kotha operations chudam :
	   Vector v4 = new Vector(20);
	   v4.add("shaik");
	   v4.add("abdul");
	   v4.add("baji"); 
	   
	   
	   System.out.println(v4);
	   System.out.println(v4.size());
	   System.out.println(v4.capacity());
	   
	   
	   //Manam vaka create cheasi dani e vector ki evachu apudu kavalsina size manam petukovachu
	   Object[] arr = new  Object[] {1,2,3,4,5,6,7}; //ekada ani elements kavaloani evachu adea mana size
	   Vector v5 = new Vector(Arrays.asList(arr));
	   
	   System.out.println(v5);
	   System.out.println(v5.size());
	   System.out.println(v5.capacity());
	}

}
