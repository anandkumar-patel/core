package anand.learn.inner1;


public class Outer 
{
	static int x=2;
	class Inner
	{
		static final int y=3;
		//static int z=4;  exception is here 
	}
	static class NestedButNotInner
	{
		static int z=5;
		static final int y=3;
	}
}
