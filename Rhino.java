
/**
 * Write a description of class Rhino here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rhino extends Animal
{
   public Rhino ()
   {
       super();
       setSpecies("rhino");
   }
   
   public void eat()
   {
       System.out.print("Yum! trees and bushes! \t");
   }
    
   public void speak ()
   {
       System.out.print("whiney whiney squeak");
   }
}