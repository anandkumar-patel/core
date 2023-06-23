package anand.learn.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LinkedHasMapDemo {

	public static void main(String[] args) {
		Map<String, Map> grns = new LinkedHashMap<>();
		List<Map> grnList = new ArrayList<>();
		Map<String, Object> grn1 = new HashMap<>();
		 grn1.put("integration_grn_id",null);
		 grn1.put("medicine_id",1);
		 grn1.put("medicine_name","demo1");
		 
		 Map<String, Object> grn2 = new HashMap<>();
		 grn2.put("integration_grn_id","2");
		 grn2.put("medicine_id",2);
		 grn2.put("medicine_name","demo2");
		 
		 Map<String, Object> grn3 = new HashMap<>();
		 grn3.put("integration_grn_id","3");
		 grn3.put("medicine_id",3);
		 grn3.put("medicine_name","demo3");
		 
		 
		 Map<String, Object> grn4 = new HashMap<>();
		 grn4.put("integration_grn_id",null);
		 grn4.put("medicine_id",4);
		 grn4.put("medicine_name","demo4");
		 
		 grnList.add(grn1);
		 grnList.add(grn2);
		 grnList.add(grn3);
		 grnList.add(grn4);
		 
		 
		 for (Map grn : grnList) {
			if (grns.keySet().contains(grn.get("integration_grn_id"))) {
				Map existingGrn = grns.get(grn.get("integration_grn_id"));
				 ((List<Map<String, Object>>) existingGrn.get("medicines")).add(getMedicine(grn));

			} else {
				List<Map> medicines = new ArrayList<>();
		        medicines.add(getMedicine(grn));
		        grn.put("medicines", medicines);
				grns.put((String) grn.get("integration_grn_id"), grn);
			}
		 }
		 
		 
	}
	
	private static Map<String, Object> getMedicine(Map<String, Object> grn) {
		Map<String, Object> medicine = new HashMap<>();
		medicine.put("medicine_id", grn.get("medicine_id"));
		medicine.put("medicine_name", grn.get("medicine_name"));
		return medicine;
	}
	

}
