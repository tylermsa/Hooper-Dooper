// tylerm

import java.util.ArrayList;

public class Player
{
	int num;
	ArrayList<String> lastRespone;
	
	
	public Player(int plyr)
	{
		int num = plyr;
		lastRespone = new ArrayList<String>();
		
	}	// public Player(int plyr)
	
	public ArrayList<String> deconstruct(String response)
	{
		lastRespone.clear();
		
		// Put code to create list of words here, separate with ' ' char
		
		
		return lastResponse; // 
		
	}	// public ArrayList<String> deconstruct(String response)
	
	
	public int getPlayer()
	{
		return num;
		
	}	// public int getPlayer()
	
	
	public ArrayList<String> getLastString()
	{
		return lastRespone;
		
	}	// public ArrayList<String> getLastString()
	
	
	public String toString()
	{
		return "[" + num + "] Last Response: " + lastResponse.get();
		
	}	// public String toString()
	

} // public class Player

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
		
*/