package anand.learn.cloning.shallow;

public class ShallowCopyInJava
{
    public static void main(String[] args)
    {
        Course science = new Course("Physics", "Chemistry", "Biology");
 
        Student student1 = new Student(1112, "Anand", science);
 
        Student student2 = null;
 
        try
        {
            //Creating a clone of student1 and assigning it to student2
 
            student2 = (Student) student1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
 
        //Printing the subject3 of 'student1'
 
        System.out.println(student1.course.subject3);         //Output : Biology
 
        //Changing the subject3 of 'student2'
 
        student2.course.subject3 = "Mathematics";
 
        //This change will be reflected in original student 'student1'
 
        System.out.println(student1.course.subject3);       //Output : Mathematics
    }
}
