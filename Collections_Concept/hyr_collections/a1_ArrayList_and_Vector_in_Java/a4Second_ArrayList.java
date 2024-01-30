package a1_ArrayList_and_Vector_in_Java;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * manam indaka chepukuna vector lo object create itea chalu daniki default size 10 ani assign iedi like
   Vector v1 = new Vector();
   kani ArrayList lo ala kadu, ArrayList<Integer> al1 = new ArrayList<>(); ela arraylist ki object create
   chaiyaganea default size aneadi assign aavadu, manam aa arraylist lo ado vaka element add cheasina 
   tarvata nea default size aneadi assign iedi. 
   
   asal e ArrayList lo manam theoritical ga chepukunatu ArrayList default size vacheasi 0 manam 1st 
   element add chestea dani default size 10 ani chudochu by debug,vaka vela manam ArrayList yoka size 
   ala pergutundo teliyali antea 11th element add chestea 50% increse iedi capacity 10+5=15, antea manam 
   debug chaiyali, ala debug chaiyali antea vaka chota toggle breakout point petukoni "fn+f6" press 
   chestu potea manaki ardam iedi, aa object yoka reference variable v1 undi kada akada mouse pointer 
   place chaiyali debug time lo apudu manaki ardam iedi.
   
   main ga al1.add(0,10); --> elanti index tho add cheasea elements untai kada vati vala ArrayList 
   performance padipodi y because elements ani right shift chaiyali kada anduku.
   
   Important points to remember :
   1. What is the default capacity? (Capacity when elements are not added to the list) --> 0
   2. What is the initial capacity? --> 10
   3. Does it allow duplicate elements? --> Yes
   4. Does it allow null values? --> Yes
   5. Does it maintain the insertion order? --> Yes
   6. Does it maintain the sorted order? --> No
   7. Does it offer the random access of elements? --> Yes(manaki kavalsina value retrive cheasukotam)
   8. Is it synchronised? --> No(but we use collections class for synchronize)
   9. What is it good at? --> only data ni store cheasukovali and retrive cheasukovali anapudu edi best.
   
 */


public class a4Second_ArrayList {

	public static void main(String[] args) {

	   ArrayList<Integer> al1 = new ArrayList<>();
	   al1.add(5);
	   al1.add(0,10);
	   al1.add(5);
	   al1.add(0,10);
	   al1.add(5);
	   al1.add(0,10);
	   al1.add(5);
	   al1.add(0,10);
	   al1.add(5);
	   al1.add(0,10);
	   al1.add(5);
	   al1.add(0,10);
	   System.out.println(al1);
	   System.out.println(al1.size());
	   
	   System.out.println("=============================================");
	   
	   //Addition of elements into the list
	   Integer[] arr = new Integer[]{ 1, 2, 3, 4, 5, 6, 7 }; 
	   ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(arr));
	   al2.add(9);
	   System.out.println("Addition of elements into the list --> " +al2);
	   
	   System.out.println("=============================================");
	   
	   //Retriveal of elements from the list
	   System.out.println("Retrival of elements from the list --> " +al2.get(5));
	   
	   System.out.println("=============================================");
	   
	   //Deletion of elements from the list
	   al2.remove(1);
	   System.out.println("Deletion of elements from the list --> " +al2);
	   
	   System.out.println("=============================================");
	   
	   //Verification of elements from the list
	   System.out.println("Verification of elements from the list --> " +al2.contains(3));
	   
	   System.out.println("=============================================");
	   
	   //Updation of elements in the list
	   al2.set(0, 25);
	   System.out.println("Updation of elements in the list --> " +al2);
	   
	}

}
