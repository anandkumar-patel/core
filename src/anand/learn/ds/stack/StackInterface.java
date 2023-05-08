package anand.learn.ds.stack;

/**
 * An interface to represent Stack data structure. We need to name it to
 * something other than Stack because there is already a class named Stack in
 * java.util package
 * 
 * @author anandpatel
 *
 * @param <T>
 */
public interface StackInterface<T> {

	public boolean push(T value);

	public T pop();

	public boolean contains(T value);

	public int size();

	public void clear();

	public boolean isEmpty();
}
