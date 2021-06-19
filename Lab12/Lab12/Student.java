
package Practice.Lab12;

import java.util.Scanner;

public class Student extends Person implements Association
{
    private int rollNum;
    private int semester;

    public Student(String name, String id) 
    {
        super(name, id);
    }
    
    public void associate() 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Roll Number,");
        this.rollNum = input.nextInt();
        System.out.println("Enter Semester,");
        this.semester = input.nextInt();
        input.close();
         
    }
    
     public String toString()
    {
        return "   STUDENT\n" + super.toString() + "\nRoll Number:\t" + rollNum + "\nSemester:\t" + semester;
    }
    
    
}
