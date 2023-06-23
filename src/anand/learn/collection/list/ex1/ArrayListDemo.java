package anand.learn.collection.list.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author anandpatel
 *
 *initial size :10
 *synchronized : no
 *size increase by 50%
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		System.out.println("Arraylist of Integer type :");
		List<Integer> intList = new ArrayList<>();
		intList.add(21);
		intList.add(41);
		intList.add(11);
		intList.add(45);
		intList.add(13);
		intList.add(19);
		
		//looping arraylist
		System.out.println("Printing intList ");
		ListIterator<Integer> intIter = intList.listIterator();
		while(intIter.hasNext()) {
			System.out.println(intIter.next());
		}
		
		//sorting the arraylist
		Collections.sort(intList);
		System.out.println("Printing intList after sorting");
		ListIterator<Integer> intIter1 = intList.listIterator();
		while(intIter1.hasNext()) {
			System.out.println(intIter1.next());
		}
		
		System.out.println("Arraylist of string type :");
		List<String> stringList = new ArrayList<>();
		stringList.add("Rama");
		stringList.add("Ganesh");
		stringList.add("shooru");
		stringList.add("davil");
		stringList.add("practo");
		stringList.add("donkey");
		
		//looping arraylist
		System.out.println("Printing stringList ");
		ListIterator<String> stringIter = stringList.listIterator();
		while(stringIter.hasNext()) {
			System.out.println(stringIter.next());
		}
		
		//sorting the arraylist
		Collections.sort(stringList);
		System.out.println("Printing stringList after sorting");
		ListIterator<String> stringIter1 = stringList.listIterator();
		while(stringIter1.hasNext()) {
			System.out.println(stringIter1.next());
		}
		
		System.out.println("Arraylist of custom object type {countryList}:");
		List<Country> countryList = new ArrayList<>();
		countryList.add(new Country(21, "India", 135000000L));
		countryList.add(new Country(31, "shri Lanka", 350000L));
		countryList.add(new Country(23, "Myanmar", 5000000L));
		countryList.add(new Country(11, "Bangladesh", 70000L));
		countryList.add(new Country(17, "bhutan", 9000L));
		countryList.add(new Country(51, "Tibbat", 234500L));
		
		//looping arraylist
		System.out.println("Printing countryList ");
		ListIterator<Country> countryIter = countryList.listIterator();
		while(countryIter.hasNext()) {
			System.out.println(countryIter.next().toString());
		}
		
		//sorting the arraylist 
		Collections.sort(countryList);
		System.out.println("Printing countryList after sorting by default sort order by Comparable{id}");
		ListIterator<Country> countryIter1 = countryList.listIterator();
		while(countryIter1.hasNext()) {
			System.out.println(countryIter1.next().toString());
		}
		
		Collections.sort(countryList, new CountryPopulationComparator());
		System.out.println("Printing countryList after sorting by country popution using Comparator ");
		ListIterator<Country> countryIter2 = countryList.listIterator();
		while (countryIter2.hasNext()) {
			System.out.println(countryIter2.next().toString());
		}
		
		Collections.sort(countryList, new CountryNameComparator());
		System.out.println("Printing countryList after sorting by country name using Comparator ");
		ListIterator<Country> countryIter3 = countryList.listIterator();
		while (countryIter3.hasNext()) {
			System.out.println(countryIter3.next().toString());
		}
		
		
	}
}
