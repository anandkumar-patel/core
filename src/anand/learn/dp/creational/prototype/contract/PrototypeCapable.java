package anand.learn.dp.creational.prototype.contract;

public interface PrototypeCapable extends Cloneable {
	public PrototypeCapable clone() throws CloneNotSupportedException;
}
