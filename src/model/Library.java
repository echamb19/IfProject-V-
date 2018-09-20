package model;

public class Library
{
	private int books; 
	private int people; 
	private String librarianName;
	private double finishedBooks;
	private boolean isOpen;
	private String libraryName;
	
	public Library()
	{
		
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
