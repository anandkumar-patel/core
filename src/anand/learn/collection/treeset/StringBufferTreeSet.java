package anand.learn.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class StringBufferTreeSet {

	public static void main(String[] args) {
		TreeSet<StringBuffer> tree = new TreeSet<>(new StringBufferComparator());
		tree.add(new StringBuffer("H"));
		tree.add(new StringBuffer("A"));
		tree.add(new StringBuffer("C"));
		tree.add(new StringBuffer("K"));
		System.out.println(tree);
	}
}

class StringBufferComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		return o1.toString().compareTo(o2.toString());
	}

}