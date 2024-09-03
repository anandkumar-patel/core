package anand.serialization;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class ExternalizableTest implements Externalizable{

    static ExternalizableTest obj = new ExternalizableTest();
    static File f = new File("ExternalizableTest.txt");
	private static ObjectOutputStream oos;
	private static ObjectInputStream ois;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(f);
        oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream(f);
        ois = new ObjectInputStream(fis);
        ExternalizableTest obj1 = (ExternalizableTest) ois.readObject();

    }


    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(123);

    }

 
    public void readExternal(ObjectInput in) throws IOException,
            ClassNotFoundException {

        System.out.println(in.readInt());

    }
}
