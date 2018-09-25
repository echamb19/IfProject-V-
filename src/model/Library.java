package model;

public class Library
{
	private int books; 
	private int people; 
	private String librarianName;
	private double finishedBooks;
	private boolean isOpen;
	private String libraryName;
	
	// v This is a javadoc used to put info in about things and you get the info when you hover over it. 
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
		this.isOpen = false; 
		this.libraryName = "NoNameLibrary";
	}
	
	/**
	 * Initializes the books etc. with a value for the stuff.
	 * @param books 			The number of books.
	 * @param people 			The number of people.
	 * @param librarianName 	The name of the Librarian. 
	 * @param finishedBooks 	The number of books I have finished. 
	 * @param isOpen 			This tells you whether the library is open. 
	 * @param libraryName 		What the name of the library is. 
	 */
	 public Library(int books, int people, String librarianName, double finishedBooks, boolean isOpen, String libraryName)
	 {
		 this.books = books;
		 this.people = people; 
		 this.librarianName = librarianName; 
		 this.libraryName = libraryName;
		 this.isOpen = isOpen;
		 this.librarianName = librarianName;		 
	 }
	 
	 public int getBooks()
	 {
		 return books;
	 }
	 
	 public int getPeople()
	 {
	 return people;
	 }

	 public String getLibrarianName()
	 {
		 return librarianName;
	 }
	 
	 public double getFinishedBooks()
	 {
		 return finishedBooks;
	 }
	 
	 public boolean getIsOpen()
	 {
		 return isOpen;
	 }
	 
	 public String getLibraryName()
	 {
		 return libraryName;
	 }
	 
	 
	 public void setBooks(int books)
	 {
		 this.books = books;
	 }
	 
	 public void setPeople(int people)
	 {
		 this.people = people; 
	 }
	 
	 public void setLibrarianName(String librarianName)
	 {
		 this.librarianName = librarianName; 
	 }
	 
	 public void setFinishedBooks(double finishedBooks)
	 {
		 this.finishedBooks = finishedBooks;
	 }
	 
	 public void setIsOpen (boolean isOpen)
	 {
		 this.isOpen = isOpen;
	 }
	 
	 public void setLibraryName(String libraryName)
	 {
		 this.libraryName = libraryName;
	 }
	 
	 // I DID IT... WHY IS CAPS LOCK ON?
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
