
package Practice.Lab12;

public class Person 
{
    protected String name;
    protected String id;

    public Person(String name, String id) 
    {
        this.name = name;
        this.id = id;
    }
    public String toString()
    {
        return "Name:\t" + name + "\nID:\t" + id;
    }
        
}
