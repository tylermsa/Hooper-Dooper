// tylerm	Hooper Dooper	Nov 19. 2020

import java.util.ArrayList;
import java.util.Scanner;

public class HooperDooper
{
	public static void main(String[] args)
	{
		// Game Setup
		final String ENDING = "ooper";
		final String[] STARTING_WORDS = {"hooper" , "dooper"};
		final int PLAYERS = 2;
		
		Scanner kb = new Scanner(System.in);
		Setup game = new Setup(STARTING_WORDS, ENDING);
		
		String response = "";
		boolean isOver = false;	// This checks if the game is still active
		int currentPlayer = 1;
		boolean isRightOrder = true;
		
		System.out.println("Hooper Dooper");
		System.out.println("powered by tylerm");
		System.out.println("");
		System.out.println("Starting Phrase: " + game.toString());
		
		try
		{
			Thread.sleep(4000);
			
		}
		catch(InterruptedException e)
		{
			System.out.println("HooperDooper main :: [CAUGHT] : InterruptedException");
			
		}
		
		// Game loop
		while(isOver == false)
		{
			for(int i = 0; i < 50; i++)
				System.out.println("\n");
			
			System.out.println("Remember the order!");
			System.out.println("Type in the correct order, Player " + currentPlayer + "!");
			System.out.println("[!] Separate the words with a single space.");
			response = kb.nextLine();
			isRightOrder = game.check(response);
			
			System.out.println();
			
			if(isRightOrder)
			{
				System.out.println("Add one(1) word to the worder with the ending '-" + ENDING + "', Player 1!");
				response = kb.nextLine();
				
				// add to list
				game.addWord(response);
				
				if(currentPlayer == PLAYERS)
					currentPlayer = 1;
				else
					currentPlayer ++;
			}
			else
			{
				System.out.println("[!] Player " + currentPlayer + " failed to give the correct order. [!]");
				isOver = true;
				break;
			}
			
			
			
			// isOver = true;
		}	// while(isOver == false)
		
		System.out.println("GAME OVER");
		
		
	} // main
	
}	// public class HooperDooper

/*

// Player class(int num)
	int Player;
	ArrayList<String> lastRespone;
	
	// returns the arraylist when for response
	ArrayList<String> deconstruct(String response)
	
	// returns the player
	int getPlayer()
	
	// returns last string entered by player
	ArrayList<String> getLastString()
		
	
// Phrase class(String ending, Array)
	ArrayList<String> phrases;
	
	// returns true if string array is valid
	boolean check(ArrayList<String> checked)
	
		
// Print Class(int player, ArrayList<String> words)	// {ESSENTIAL PART OF THE PHRASE CLASS}
	int player;
	ArrayList<String> words;
	
	// Prints Playable string
	printString()
	
	// Clears text panel on run
	clearPanel()
	
	
	
*/