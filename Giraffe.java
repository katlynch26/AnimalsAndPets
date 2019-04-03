
/**
 * Write a description of class Giraffe here.
 *
 * @author Michael Buescher
 * @version 2019-04
 */

public class Giraffe extends Animal
{

    public Giraffe ()
    {
        super();
        setSpecies("giraffe");
    }
    
    public void eat ()
    {
        System.out.print ("Yum!  leaves and twigs! \t");
    }
    
    public void speak ()
    {
        System.out.print (" < silence > ");
    }
}
