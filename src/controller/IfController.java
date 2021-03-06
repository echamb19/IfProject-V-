package controller;

/**
 * Allows you to use the pop-up windows to type into them and get responses.
 */
import javax.swing.JOptionPane;
import model.Library;
import java.util.ArrayList;

public class IfController
{
	/**
	 * Builds instance of the Controller
	 */
//	public Controller() <-- Not sure what I'm doing wrong, but one step at a time. 
//	{

//	}
	
	public void start() 
	{
		loopy();
		myLoop();
		mathLoop();
		practiceList();
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
		Library finishedBooks = new Library();
		
		//Test the code
			while(!isFinished) //Never put semicolon here ever
			{

			//Do code 
			JOptionPane.showMessageDialog(null, "I am Annoying!!!");
		
			someCount++; //the ++ is different if used before. 
			someCount += 1; //use this in swift
			//Update the test variable
			
			if (someCount > 10)
			{
				isFinished = true;
			//update test variable last thing before close the loop 
			}
		}
		
		String response = JOptionPane.showInputDialog(null, "How many books does the library have?");
		while(!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "Enter a whole number please.");
		}
		
		books.setBooks(Integer.parseInt(response));
		//JOptionPane.showMessageDialog(null, "Your library has" + Library.getBooks() + "books");
	//	for (int index = 0; index < 10; index++)
		
		
		String NrBooks = JOptionPane.showInputDialog(null, "How many books have you finished?");
		while(!validDouble(NrBooks))
		{
			NrBooks = JOptionPane.showInputDialog(null, "Enter a decimal number please.");
		}
		
		books.setFinishedBooks(Double.parseDouble(NrBooks));
	}
	
	private void myLoop()
	{

		Library people = new Library();
		
		String Peeps = JOptionPane.showInputDialog(null, "How many peoople are in the library?");
		while (!validInt(Peeps))
		{
			Peeps = JOptionPane.showInputDialog (null, "Enter a whole number please.");
		}
		people.setPeople(Integer.parseInt(Peeps));
		
		
		String open = JOptionPane.showInputDialog(null, "The library is open?");
		while (!validBoolean(open))
		{
			open = JOptionPane.showInputDialog(null, "Please type either true or false.");		
		}
		people.setIsOpen(Boolean.parseBoolean(open));
	}
	
	
	private void mathLoop()
	{	
		Library math = new Library();
		boolean isCorrect = true;
		while (isCorrect == true)
		{
		String answer = JOptionPane.showInputDialog(null, "What is '67-32'?");
		while (!validInt(answer))
		{
			answer = JOptionPane.showInputDialog(null, "Type a whole number.");
		}
		math.setMath(Integer.parseInt(answer));
		if (math.getMath() == 35)
		{
			JOptionPane.showMessageDialog(null, "You got it right! :D");
			isCorrect = false;
		}
		else 
			{
			JOptionPane.showMessageDialog (null, "You got it wrong, you IDIOT!");
			}
		
		}
	
	}
	
	/**
	 * This is my practice list. I used it to make a list of books titles that I could think of that would be in the library. 
	 * I added five books then got rid of the book that didn't belong. (It was poetry, which is placed with non-fiction.)
	 * All of the variables are String variables, they are added with the '.add' mechanism. 
	 */
	public void practiceList()
	 {
		 ArrayList<String> bookTitles = new ArrayList<String>();
		 
			bookTitles.add("Throne of Glass");
			bookTitles.add("Mr. Lemoncello's Library");
			bookTitles.add("Percy Jackson and the Lightning Theif");
			bookTitles.add("Blood of Olympus");
			bookTitles.add("Where the Sidewalk Ends");
			//I put things inside the list ^ there and took something out V there
			bookTitles.remove("Where the Sidewalk Ends");
		 
		
		for(String title : bookTitles)
		{
		 JOptionPane.showMessageDialog (null, "There is a book. It's name is " + title);	 
		}
		
		
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		 {
			numbers.add(5);
			numbers.add(7);
		 }
	 }
	/** 
	 * This code is meant to catch a mistake when you are meant to type a double. 
	 * It is effective in preventing your program from crashing. 
	 * @param mightBeDouble
	 * @return
	 */
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
			isValid = true;
		}
		catch (NumberFormatException error) //Two things inside perens is formal parameter
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number. :)");
		}
		
		return isValid;
	}
	
	public boolean validBoolean(String maybeBoolean)
	{
		boolean isValid = false; 
		try
		{
			Boolean.parseBoolean(maybeBoolean);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Pick in true or false.");
		}
		return isValid;
		
	}
}

