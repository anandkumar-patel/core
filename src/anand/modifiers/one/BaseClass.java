package anand.modifiers.one;

public class BaseClass {
	private int privateMember;
	int defaultMember;
	protected int protectedMember;
	public int publicMember;

	void defaultMethod() {
		System.out.println("default Method");
	}

	protected void protectedMethod() {
		System.out.println("protected Method");
	}
}

class ChildOfBaseClass extends BaseClass {
	void methodOfClassB() {
		// System.out.println(privateMember); Private member can not be
		// inherited
		System.out.println(defaultMember); // Default member can be inherited
											// within package
		System.out.println(protectedMember); // protected member can be
												// inherited to any subclass
		System.out.println(publicMember); // public member can be inherited to
											// all sub classes

		defaultMethod();
		protectedMethod();
	}
}

class ChildOfChildClass extends ChildOfBaseClass {
	void methodOfClassC() {
		System.out.println(defaultMember); // Default member can be inherited
											// within package
		System.out.println(protectedMember); // protected member can be
												// inherited to any subclass
		System.out.println(publicMember); // public member can be inherited to
											// any subclass

		defaultMethod();
		protectedMethod();

		ChildOfBaseClass b = new ChildOfBaseClass();
		System.out.println(b.defaultMember); // Default member can be used
												// within package
		System.out.println(b.protectedMember); // Protected member can be used
												// anywhere in the package
		System.out.println(b.publicMember); // Public member can be used
											// anywhere

		b.defaultMethod();
		b.protectedMethod();
	}
}

class OtherBaseClass {
	public void methodOfClassF() {
		BaseClass a = new BaseClass();
		System.out.println(a.defaultMember); // Default member can be used
												// within package
		System.out.println(a.protectedMember); // Protected member can be used
												// anywhere in the package
		System.out.println(a.publicMember); // Public member can be used
											// anywhere

		a.defaultMethod();
		a.protectedMethod();
	}
}
