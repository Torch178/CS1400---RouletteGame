import java.util.Scanner;
import java.util.Random;

public class Mission14_CLuke
{

   public static void main (String[] args)
   {
   
      //Intialize variables and instance objects
      Scanner in = new Scanner(System.in);
      Random r = new Random();
      Roulette b = new Roulette();
      
      int number = r.nextInt(37);
      
      //Call betOnce method to play game
      b.betOnce(in, number);
   
   }

}