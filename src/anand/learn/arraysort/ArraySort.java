package anand.learn.arraysort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
 
abstract class Animal{
	String name;
	int size;
	int weight;
}
 
class Dog extends Animal{
	public Dog(String name, int size, int weight){
		this.name = name;
		this.size = size;
		this.weight = weight;
	}
}
 
class Cat extends Animal{
	public Cat(String name, int size, int weight){
		this.name = name;
		this.size = size;
		this.weight = weight;
	}
}
 
class AnimalSizeComparator implements Comparator<Animal>{
 
	
	public int compare(Animal o1, Animal o2) {
		return o1.size - o2.size;
	}
	//in this way, all sub classes of Animal can use this comparator.
}

class AnimalWeightComparator implements Comparator<Animal> {

	public int compare(Animal o1, Animal o2) {
		return o1.weight - o2.weight;
	}
}
 
public class ArraySort {
 
	public static void main(String[] args) {
		Dog d1 = new Dog("dog2", 2, 50);
		Dog d2 = new Dog("dog1", 1, 30);
		Dog d3 = new Dog("dog3", 3, 40);
 
		Dog[] dogArray = {d1, d2, d3};
		System.out.println("Before Sorting(Dog) :");
		printAnimal(dogArray);
 
		Arrays.sort(dogArray, new AnimalSizeComparator());
		System.out.println("After Sorting - Dog(by size) :");
		printAnimal(dogArray);
		
		Arrays.sort(dogArray, new AnimalWeightComparator());	
		System.out.println("After Sorting - Dog(by weight) :");
		printAnimal(dogArray);
 
		System.out.println();
 
		//when you have an array of Cat, same Comparator can be used. 
		Cat c1 = new Cat("cat2", 2, 50);
		Cat c2 = new Cat("cat1", 1, 30);
		Cat c3 = new Cat("cat3", 3, 40);
 
		Cat[] catArray = {c1, c2, c3};
		System.out.println("Before Sorting(Cat) :");
		printAnimal(catArray);
 
		Arrays.sort(catArray, new AnimalSizeComparator());	
		System.out.println("After Sorting - Cat(by size) :");
		printAnimal(catArray);
		
		Arrays.sort(catArray, new AnimalWeightComparator());	
		System.out.println("After Sorting - Cat(by weight) :");
		printAnimal(catArray);
		
		Comparator<Animal> comp = Collections.reverseOrder(new AnimalSizeComparator());
		System.out.println("After Sorting reverse- Cat(by size) :");
		Arrays.sort(catArray,comp);
		printAnimal(catArray);
	}
 
	public static void printAnimal(Animal[] animals){
		for(Animal a: animals)
			System.out.println("Name = " + a.name + " size=" + a.size + " weight=" + a.weight + " ");
		System.out.println();
	}
}
