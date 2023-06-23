package anand.learn.passby;

public class Test1 {

  public static void main(String[] args) {

    Balloon1 red = new Balloon1("Red"); //memory reference 50
    Balloon1 blue = new Balloon1("Blue"); //memory reference 100
    
    swap(red, blue);
    System.out.println("****** in main method after calling swap() ******");
    System.out.println("red color="+red.getColor());
    System.out.println("blue color="+blue.getColor());
    
    foo(blue);
    System.out.println("****** in main method after calling foo() ******");
    System.out.println("blue color="+blue.getColor());
    
  }

  private static void foo(Balloon1 balloon) { //baloon=100
    balloon.setColor("Red"); //baloon=100
    balloon = new Balloon1("Green"); //baloon=200
    balloon.setColor("Blue"); //baloon = 200
  }

  //Generic swap method
  public static void swap(Balloon1 o1, Balloon1 o2){
    Balloon1 temp = o1;
    o1=o2;
    o2=temp;
    System.out.println("****** in swap method******");
    System.out.println("red color="+o1.getColor());
    System.out.println("blue color="+o2.getColor());
    
  }
}