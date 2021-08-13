// tylerm

import java.util.ArrayList;

public class Setup
{
	String ending;
	ArrayList<String> order;
	
	
	public Setup(String[] start, String end)
	{
		ending = end;
		order = new ArrayList<String>();
		
		for(int i = 0; i < start.length; i++)
			order.add(start[i]);
		
	}	// public Setup
	
	
	public boolean check(String entered)
	{
		ArrayList<String> checkString = buildList(entered);
		boolean isTrue = true;
		
		// System.out.println(checkString);
		
		for(int i = 0; i < order.size(); i++)
		{
			if(checkString.get(i).equals(order.get(i)))
				isTrue = true;
			else
			{
				isTrue = false;
				break;
			}
		}	// for(int i = 0; i < order.size(); i++)
		
		
		return isTrue;
	}	// public boolean check(String entered)
	
	
	public ArrayList<String> buildList(String stringVersionOfList)
	{
		ArrayList<String> list = new ArrayList<String>();
		Character charcter = ' ';
		int wordStart = 0;
		
		for(int i = 0; i < stringVersionOfList.length(); i++)
		{
			charcter = stringVersionOfList.charAt(i);
			
			if(charcter == ' ')
			{
				list.add(stringVersionOfList.substring(wordStart, i));
				wordStart = i +1;
			}
			else if(i == stringVersionOfList.length() -1)
				list.add(stringVersionOfList.substring(wordStart, i +1));
		
			
		}	// for(int i = 0; i < stringVersionOfList.length(); i++)
		
		
		return list;
		
	}	// public ArrayList<String> buildList(String list)
	
	
	public void addWord(String word)
	{
		order.add(word);
		
	}	// public void addWord(String word)
	
	
	// toString
	public String toString()
	{
		return "" + order;
		
	}	// public String toString()
	
}	// public class Setup