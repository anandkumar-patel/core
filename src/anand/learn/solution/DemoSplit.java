package anand.learn.solution;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class DemoSplit {

	public static void main(String[] args) {
		String itemSubgroupId = "Hello, jaba";
		String[] itemSubGroupIds = null;
		itemSubGroupIds = itemSubgroupId.split("\\,");
		System.out.println(itemSubGroupIds[0]+" : "+itemSubGroupIds[1]);
		
		System.out.println("R".equalsIgnoreCase(""));
		
		BigDecimal qty = new BigDecimal("0");
		if (qty.compareTo(BigDecimal.ZERO) == 0) {
			System.out.println("True hahaha");
		}
		
		Medicine med1 = new Medicine(1, 1, "medicineName1", "batchId1");
		Medicine med2 = new Medicine(1, 2, "medicineName1", "batchId2");
		Medicine med3 = new Medicine(2, 3, "medicineName2", "batchId3");
		Medicine med4 = new Medicine(1, 4, "medicineName1", "batchId1"); 
		
		Map <String,Medicine> mapObj = new HashMap<>();
		if (null == mapObj.get(med1.getMedicineid()+"_"+med1.getBatchId())) {
			mapObj.put(med1.getMedicineid()+"_"+med1.getBatchId(), med1);
		} else {
			System.out.println("Medicine is duplicate :"+med1.getMedicineName()+" :"+med1.getBatchId());
		}
		
		if (null == mapObj.get(med2.getMedicineid()+"_"+med2.getBatchId())) {
			mapObj.put(med2.getMedicineid()+"_"+med2.getBatchId(), med2);
		} else {
			System.out.println("Medicine is duplicate :"+med2.getMedicineName()+" :"+med2.getBatchId());
		}
		
		if (null == mapObj.get(med1.getMedicineid()+"_"+med3.getBatchId())) {
			mapObj.put(med3.getMedicineid()+"_"+med3.getBatchId(), med3);
		} else {
			System.out.println("Medicine is duplicate :"+med3.getMedicineName()+" :"+med3.getBatchId());
		}
		
		if (null == mapObj.get(med4.getMedicineid()+"_"+med4.getBatchId())) {
			mapObj.put(med4.getMedicineid()+"_"+med4.getBatchId(), med4);
		} else {
			System.out.println("Medicine is duplicate :"+med4.getMedicineName()+" :"+med4.getBatchId());
		}
	}

	
}


class Medicine {
	int medicineid;	
	int lotId;
	String medicineName;
	String batchId;

	public Medicine(int medicineid, int lotId, String medicineName, String batchId) {
		this.medicineid = medicineid;
		this.lotId = lotId;
		this.medicineName = medicineName;
		this.batchId = batchId;
	}
	public int getMedicineid() {
		return medicineid;
	}
	public void setMedicineid(int medicineid) {
		this.medicineid = medicineid;
	}
	public int getLotId() {
		return lotId;
	}
	public void setLotId(int lotId) {
		this.lotId = lotId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	
}

