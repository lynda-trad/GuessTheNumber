package guessTheNumber;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessTheNumber
{
	public static void main(String[] args) throws IOException
	{
		int numberToGuess = (int)Math.floor(Math.random()*(101)+1);
		int numberGuessed = 0;
		System.out.println("~ Guess The Number ! ~");
		System.out.println("~ Please enter a number between 1 and 100. ~");
		
		while(numberGuessed != numberToGuess)
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            String numberGuessedStr = br.readLine();
            try 
            {
            	numberGuessed = Integer.parseInt(numberGuessedStr);
            	if(numberGuessed == numberToGuess)
            	{
            		System.out.println("~ Congratulations ! The number was indeed " + numberGuessed + " !~");
        	        br.close();
            		System.exit(0);
            	}
            	else if(numberGuessed < numberToGuess)
            	{
            		System.out.println("~ The number to guess is HIGHER than " + numberGuessed + " ! ~");
            	}
            	else
            	{
            		System.out.println("~ The number to guess is LOWER than " + numberGuessed + " ! ~");
            	}
            }
            catch (NumberFormatException e) 
            {
                System.out.println("Please enter an number.");
            }
		}
	}
}