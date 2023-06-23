package anand.learn.collection.map;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample0 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add(new String("a"));
		set.add(new String("b"));
		set.add(new String("c"));
		 

		
		
		
		HashMap<String, Object> hashobj = new HashMap<>();
		hashobj.put("java","JAVA");
		hashobj.put("j2se","J2SE");
		hashobj.put("j2ee","J2EE");
		hashobj.put("0-42L","Anand");
		hashobj.put("0-43-","Patel");

		System.out.println(hashobj.get("0-43-"));
	}

}
