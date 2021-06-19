
package Practice.Lab12;

public class Runner 
{
    public static void main(String[] args)
    {
        HumanResource h1 = new HumanResource();
        
        h1.add( new Teacher("Aimal", "1223344") );
        h1.add( new Teacher("Tariq", "1223345") );
        h1.add( new Teacher("Akber", "1223346") );
        h1.add( new Student("Ali", "0023347") );
        h1.add( new Student("Sabih", "0023348") );
        h1.add( new Student("Bilal", "0023349") );
        
        h1.display();
        
        Association sw = new Student("student", "98998");
        sw.associate();
        Association tw = new Student("teacher", "98998");
        tw.associate();
    }
               
}
    

