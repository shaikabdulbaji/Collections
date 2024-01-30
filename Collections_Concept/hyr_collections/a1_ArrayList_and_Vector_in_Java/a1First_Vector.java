package a1_ArrayList_and_Vector_in_Java;

import java.util.Vector;

/*
 * import java.util.Vector; --> edi Vector yoka import
   import java.util.ArrayList; --> edi ArrayList yoka import
   import java.util.LinkedList; --> edi LinkedList yoka import
   ela chala imports untai vetanitiki vakatea import use cheasukovachu like
   import java.util.*; --> edi utill nunchi vachea ani imports ki use iedi.
   
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
 */

public class a1First_Vector {

	public static void main(String[] args) {

	   Vector v1 = new Vector();
	  //System.out.println(v1);
		
	   v1.add("shaik");
	   v1.add("abdul");
	   v1.add(0, "baji"); //vidiki 1st bed a kavali anduku aa index number echamu or particular index add.
	   v1.add("a1");
	   v1.add("a2");
	   v1.add("a3");
	   v1.add("a4");
	   v1.add("a5");
	   v1.add("a6");
	   v1.add("a7");
	   v1.add("a8"); //e element add cheasina tarvata 10 size kastha 20 iedi.
	   
	   v1.add("shaik");
	   v1.add("abdul");
	   v1.add(0, "baji"); //vidiki 1st bed a kavali anadu anduku aa index number echamu.
	   v1.add("a1");
	   v1.add("a2");
	   v1.add("a3");
	   v1.add("a4");
	   v1.add("a5");
	   v1.add("a6");
	   v1.add("a7");
	   v1.add("a8"); //e element add cheasina tarvata 10 size kastha 20 iedi.
	   
	   System.out.println(v1);
	   System.out.println("Size --> " +v1.size());
	   System.out.println("Capacity --> " +v1.capacity());
	}

}
