package anand.learn.solution;

public class DemoInheritance {

  public static void main(String[] args) {
    
    ChildClass child = new ChildClass();
    child.method2();
    child.method2("patel");
  }

}


class BaseClass {
  int empId;
  String empName;
  public BaseClass() {
    this.empId = 1112;
    this.empName = "anand";
  }
  
  public BaseClass(int empId, String empName) {
    this.empId = empId;
    this.empName = empName;
  }
  
  public void method1() {
    System.out.println("Base class method1() "+this.empName);
  }
  
  public void method2(String empName) {
    System.out.println("Base class method2 "+empName);
  }
  
}

class ChildClass extends BaseClass {  
  public void method2() {
    System.out.println("Child class method2 "+this.empName);
  }
  
}
