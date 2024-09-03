package anand.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerializableTest implements Serializable{ 

	private static final long serialVersionUID = 1L;
	private static ObjectOutputStream oos;
	private static ObjectInputStream ois;

	public static void main(String[] args) throws IOException, ClassNotFoundException 
    {    	
    	SerializableTest t = new SerializableTest();
        File f = new File("test.txt");
        FileOutputStream fos = new FileOutputStream(f);
        oos = new ObjectOutputStream(fos);
        oos.writeObject(t);

        FileInputStream fis = new FileInputStream(f);
        ois = new ObjectInputStream(fis);
        SerializableTest t1 = (SerializableTest) ois.readObject();
        System.out.println(t1.toString());
    }
}