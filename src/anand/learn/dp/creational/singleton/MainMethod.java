package anand.learn.dp.creational.singleton;


public class MainMethod {

	public static void main(String[] args) {

		Singleton obj1 = Singleton.getInstance("Hello Anand..");
		Singleton obj2 = Singleton.getInstance("Hello Kumar..");
		Singleton obj3 = Singleton.getInstance("Hello Patel..");
		Singleton obj4 = Singleton.getInstance("Hello Urmila..");
		
		System.out.println("initial value of obj1 : "+obj1.getInitialValue());
		System.out.println("initial value of obj2 : "+obj2.getInitialValue());
		System.out.println("initial value of obj3 : "+obj3.getInitialValue());
		System.out.println("initial value of obj4 : "+obj4.getInitialValue());
		
		System.out.println("hashcode of obj1 : "+obj1.hashCode());
		System.out.println("hashcode of obj2 : "+obj2.hashCode());
		System.out.println("hashcode of obj3 : "+obj3.hashCode());
		System.out.println("hashcode of obj4 : "+obj4.hashCode());
		
		
		
		BillPughSingleton obj5 = BillPughSingleton.getInstance();
		BillPughSingleton obj6 = BillPughSingleton.getInstance();
		BillPughSingleton obj7 = (BillPughSingleton) obj2.clone();
		System.out.println("hashcode of obj5 : "+obj5.hashCode());
		System.out.println("hashcode of obj6 : "+obj6.hashCode());
	}

}
