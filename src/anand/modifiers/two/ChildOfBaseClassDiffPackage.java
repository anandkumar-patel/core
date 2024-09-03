package anand.modifiers.two;

import anand.modifiers.one.BaseClass;

public class ChildOfBaseClassDiffPackage extends BaseClass
{
    void methodOfClassD()
    {
        //System.out.println(defaultMember);   Default members can not be inherited outside package
        System.out.println(protectedMember);  //Protected member can be inherited to any subclass
        System.out.println(publicMember);  //public member is always inherited to any subclass
        
        protectedMethod();
 
        BaseClass a = new BaseClass();
        //System.out.println(a.privateMember);   private member not visible outside the class
        //System.out.println(a.defaultMember);   Default members are not visible outside package
        //System.out.println(a.protectedMember);   Protected member can not be used outside the package.
        System.out.println(a.publicMember);     //public member can be used anywhere
        
        //a.protectedMethod();
    }
}
 
class SubChild extends ChildOfBaseClassDiffPackage
{
    void methodOfClassE()
    {
        System.out.println(protectedMember);     //Protected member can be inherited to any subclass
        System.out.println(publicMember);     //public member is always inherited
        
        protectedMethod();
 
        //System.out.println(d.protectedMember);     Protected member can not be used outside the package.
    }
}