
/**
 * Write a description of class Dog here.
 *
 * @author Kat Lynch 
 * @version 2019-04
 */
public class Dog extends Animal
{
    public Dog()
    {
        super();
        setSpecies("Dog");
    }
    
    public void eat ()
    {
        System.out.print("Yum! kibble and sometimes human food! \t");
    }
    
    public void speak()
    {
        System.out.print(" bark ruff woof");
    }
    
}
