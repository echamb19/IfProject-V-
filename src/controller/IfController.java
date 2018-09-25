package controller;

/**
 * Allows you to use the pop-up windows to type into them and get responses.
 */
import javax.swing.JOptionPane;
import model.Library;

public class IfController
{
	/**
	 * Builds instance of the Controller
	 */
//	public Controller() <-- Not sure what I'm doing wrong, but one step at a time. 
	{

	}
	
	public void start() 
	{
		loopy();
		myLoop();
		
	}
	
	private void questions()
	{
		
	}
	
	private void moreInput()
	{
		
	}
		
	/*public boolean validInt(String sample)
	{
		Not working and I'm too tired to make it work. 
	}*/
	
	private void loopy() 
	{
		//define a variable before the loop
		boolean isFinished = false; 
		int someCount = 0;
		
		
		Library books = new Library();
		
		//Test the code
		while(!isFinished) //Never put semicolon here ever
		{

			
			JOptionPane.showMessageDialog(null, "I am Annoying!!!");
		
			someCount++; //the ++ is different if used before. 
			someCount += 1; //use this in swift
		
			if (someCount > 10)
		
			{
				isFinished = true;
			//update test variable last thing before close the loop 
			}
		}
		
		String response = JOptionPane.showInputDialog(null, "How many books have you finished?");
		while(!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Enter a decimal number please.");
		}
		
		Library.setBooks(Double.parseDouble(response));
		
	}
	
	private void myLoop()
	{
		
	}
	
	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type a decimal value please.");
		}
		return isValid;
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false; 
		try
		{
			Integer.parseInt(maybeInt);
		}
		catch (NumberFormatException error) //Two things inside perens is formal perameter
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number. :)");
		}
		
		return isValid;
	}
	
}

