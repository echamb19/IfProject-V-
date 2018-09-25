package controller;

/**
 * Allows you to use the pop-up windows to type into them and get responses.
 */
import javax.swing.JOptionPane;

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
	}
	
}

