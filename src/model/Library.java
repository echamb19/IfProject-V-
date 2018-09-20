package model;

public class Library
{
	private int books; 
	private int people; 
	private String librarianName;
	private double finishedBooks;
	private boolean isOpen;
	private String libraryName;
	
	/**
	 * Default constructor for a Library. 
	 * Initializes all variables to valid, but "bad" values. 
	 * Used for later customization. 
	 */
	public Library()
	{
		this.books = -75;
		this.people = -75; 
		this.librarianName = "NotAName"; 
		this.finishedBooks = 7.5;
		
	}
	
	 public Library(int books, int people, String librarianName, double finishedBooks, boolean isOpen, String libraryName)
	 {
		 this.books = books;
		 this.people = people; 
		 this.librarianName = librarianName; 
		 this.libraryName = libraryName;
		 this.isOpen = isOpen;
		 this.librarianName = librarianName;		 
	 }
	 
}
