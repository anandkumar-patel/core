package anand.learn.office.help;

public class JavaCallBy {

	public static void main(String[] args) {

		ChargeDTO obj1 = new ChargeDTO();

		ChargeDTO obj2 = doChange(obj1);

		System.out.println("obj1 :" + obj1);
		System.out.println("obj2 :" + obj2);

	}

	public static ChargeDTO doChange(ChargeDTO obj1) {
		ChargeDTO obj2 = obj1;
		obj2.setBillNo("bill003");
		return obj2;
	}

}

class ChargeDTO {

	private String chargeId;
	private String billNo;
	private String chargeGroup;
	private String chargeHead;

	public ChargeDTO() {
		this.chargeId = "ch01";
		this.billNo = "bill001";
		this.chargeGroup = "group01";
		this.chargeHead = "head01";

	}

	public ChargeDTO(String chargeId, String billNo) {
		this.chargeId = chargeId;
		this.billNo = billNo;
		this.chargeGroup = "group02";
		this.chargeHead = "head02";

	}

	public ChargeDTO(String chargeId, String billNo, String chargeGroup, String chargeHead) {
		this.chargeId = chargeId;
		this.billNo = billNo;
		this.chargeGroup = chargeGroup;
		this.chargeHead = chargeHead;

	}

	public String getChargeId() {
		return chargeId;
	}

	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getChargeGroup() {
		return chargeGroup;
	}

	public void setChargeGroup(String chargeGroup) {
		this.chargeGroup = chargeGroup;
	}

	public String getChargeHead() {
		return chargeHead;
	}

	public void setChargeHead(String chargeHead) {
		this.chargeHead = chargeHead;
	}

	@Override
	public String toString() {
		return "[ chargeId :" + this.chargeId + " billNo :" + this.billNo + " chargeGroup :" + this.chargeGroup
				+ " chargeHead :" + this.chargeHead + "]";
	}
}
