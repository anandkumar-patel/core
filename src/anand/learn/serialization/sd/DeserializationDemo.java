package anand.learn.serialization.sd;
import java.io.*;
public class DeserializationDemo
{
	public static void main(String[] args) throws Exception {
		Student obj1;
		FileInputStream fis = new FileInputStream("serialization-file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		obj1 = (Student) ois.readObject();
		ois.close();
		System.out.println(obj1);
	}
};