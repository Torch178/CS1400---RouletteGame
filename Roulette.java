import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Roulette
{

   public double betOnce(Scanner in, double bet)
   {
      //Initialize variables
      int numGuess = 0;
      int userEntry = 0;
      int randNum = 0;
      double result = 0.0;
      
      //Generate random number
      Random r = new Random();
      randNum = r.nextInt(37);
      
         try
         {
            
            //Ask user to place bet
            System.out.println("Do you want to bet on  (1)-low  OR  (2)-high  OR  (3)-a number?");
            userEntry = in.nextInt();
            
            //Determine winner
            
            if (randNum == 0)
            {
               System.out.println("You lose");
               result = 0;
            }
            /********************************/
            
            if (userEntry == 1)
            {
               if (randNum >= 1 && randNum <= 18)
               {
                  System.out.println("You win!");
                  result = bet * 2;
               }
               
               if (randNum >= 19 && randNum <= 36)
               {
                  System.out.println("You lose...");
                  result = 0;
               }
            }
            /*********************************/
            
            else if (userEntry == 2)
            {
               if (randNum >= 1 && randNum <= 18)
               {
                  System.out.println("You lose...");
                  result = 0;
               }
               
               if (randNum >= 19 && randNum <= 36)
               {
                  System.out.println("You win!");
                  result = bet * 2;
               }         
            }
            /********************************/
            
            else if (userEntry == 3)
            {
               System.out.println("Guess a number between 1 and 36.");
               numGuess = in.nextInt();
               
               if (numGuess == randNum)
               {
                  System.out.println("You win!");
                  result = bet * 34;
               }
               
               if (numGuess != randNum && randNum != 0)
               {
                  System.out.println("You lose...");
                  result = 0;
               }
            
            }
            /********************************/
             
            else
            {
               System.out.println("Sorry, invalid entry. Please enter either (1) , (2) , or (3) to make a bet.");
            }
                  
         }
         
         catch (InputMismatchException e)
         {
            System.out.println("Sorry, invalid entry. Please enter either (1) , (2) , or (3) to make a bet.");
         }
         
         //Output number from random number generator
         System.out.println("The number was " + randNum);         
         
         //return results of bet to the main method
         return result;
      
   }//end of betOnce() method

}//end of class