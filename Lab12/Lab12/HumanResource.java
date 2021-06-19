
package Practice.Lab12;

public class HumanResource
{
    private Association [] p = new Association [6];
    private int count = 0;
    
    public void add(Association  pp)
    {
        extend();
        
        p[count] = pp;
        count++;            
    }
    
    private void extend()
    {
        Association[] newPerson = new Association[count+1];
        
        if(count > 0)
        {
            for(int i=0; i<newPerson.length; i++)
            {
                newPerson[i] = p[i];
            }
            
            p = newPerson;
        }
    }
        
    public void display()
    {
        for(int i=0; i<p.length; i++)
        {
            System.out.println(p[i] + "\n");
        }
    }
}
