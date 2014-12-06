package library;

import java.util.ArrayList;

import junit.framework.TestCase;


public class MyLibraryTest extends TestCase {


	ArrayList<Book> books;
	ArrayList<Person> people;
	 Person p1;
	 Person p2;
	 Book b1;
	 Book b2;
	 MyLibrary library;
	public void setup() {
		
		
		
		books = new ArrayList<Book>();
		people = new ArrayList<Person>();
		

		b1 = new Book("Great Expectations");
		b2 = new Book("The Devil Wears Prada");
		
		p1 = new Person();
		p2 = new Person();
		
		
		p1.setName("Fred"); 
	
		p2.setName("Amy"); 
		
		//b1.setPerson(p1);
		b2.setPerson(p2);
	books.add(b1);
	books.add(b2);
	people.add(p1);
	people.add(p2);
	
	
	
		
	}
	
	public void testMyLibrary()
	{
		setup();
		MyLibrary lib=new MyLibrary("MyLibrary");
	
		
		
		
		
		
	}
	
	

	
	public void testCheckout()
	{
		setup();
		MyLibrary library=new MyLibrary("MyLibrary");
		assertTrue(library.checkout(b1,p1));
		assertFalse(library.checkout(b1,p2));
		assertEquals("Fred", b1.getPerson().getName());
		assertEquals("Amy", b2.getPerson().getName());
	}
	
	public void testCheckin()
	{
		setup();
		MyLibrary library=new MyLibrary("MyLibrary");
		
		
		assertFalse(library.checkin(b1,p1));
		
	}
	public void testCountofBooks()
{
		setup();
		MyLibrary library=new MyLibrary("MyLibrary");
		Book b3 = new Book("Harry Potter: Chamber of Secrets");
		books.add(b3);
		b3.setPerson(p2);
	
		assertEquals(2,p2.getCountofBooks());
}

public void testgetAvailableBooks()
{
	Book b4 = new Book("Lord of the Rings");
	Book b5 = new Book("Harry Potter: Deadthly Hallows"); //add available books
	assertEquals(2, getAvailableBooks);
}

}
