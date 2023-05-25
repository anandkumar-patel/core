package anand.learn.comparator.set1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
public class ComparatorDemo {
	public static void main(String[] args) {
		HDTV tv1 = new HDTV(55, "Samsung");
		HDTV tv2 = new HDTV(60, "Sony");
		HDTV tv3 = new HDTV(42, "Panasonic");
		HDTV tv4 = new HDTV(72, "Akai");
		HDTV tv5 = new HDTV(32, "Vediocon");
 
		ArrayList<HDTV> al = new ArrayList<HDTV>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
		al.add(tv4);
		al.add(tv5);
 
		Collections.sort(al, new SizeComparator());
		System.out.println("TV displays in screen size increasing order :");
		System.out.println("Brand\t : Size");
		for (HDTV a : al)
			System.out.println(a.getBrand()+" : "+a.getSize());
		
		// for reverse order		
		System.out.println("TV displays in screen size decreasing order :");
		System.out.println("Brand\t : Size");
		Comparator<HDTV> comparator = Collections.reverseOrder(new SizeComparator());
		Collections.sort(al,comparator);
		for (HDTV a : al)
			System.out.println(a.getBrand()+" : "+a.getSize());
		
		
	}
}
