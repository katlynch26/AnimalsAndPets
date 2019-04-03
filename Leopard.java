
/**
 * Write a description of class Leopard here.
 *
 * @author Patty Gannon.
 * @version 2019-04
 */
public class Leopard extends Animal
{
    public Leopard()
    {
        super();
        setSpecies("leopard");
    }  
    
    public void eat()
    {
       System.out.print("Yum! Zebra, Gazelle, and Wildebeest! \t"); 
    }
    
    public void speak()
    {
        System.out.print(" growl! hisssss ");
    }
}
