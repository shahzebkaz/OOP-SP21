
package Practice.Lab12;

import java.util.Scanner;

public class Teacher  extends Person implements Association
{
    private String designation;
    private String department;

    public Teacher(String name, String id) 
    {
        super(name,id);
    }
    
    public void associate() 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Desingnation,");
        this.designation = input.nextLine();
        System.out.println("Enter Department,");
        this.department = input.nextLine();
        input.close();
    }
    
     public String toString()
    {
        return "   TEACHER\n" + super.toString() +  "\nDesignation:\t" + designation + "\nDepartment:\t" + department;
    }
    
}
