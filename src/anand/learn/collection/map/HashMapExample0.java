package anand.learn.collection.map;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample0 {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("a"));
		hashSet.add(new String("b"));
		hashSet.add(new String("c"));
		 

		
		
		
		HashMap<String, Object> hashobj = new HashMap<>();
		hashobj.put("java","JAVA");
		hashobj.put("j2se","J2SE");
		hashobj.put("j2ee","J2EE");
		hashobj.put("0-42L","Anand");
		hashobj.put("0-43-","Patel");

		System.out.println(hashobj.get("0-43-"));
	}

}
