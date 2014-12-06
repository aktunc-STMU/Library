package library;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testBook(){
		Book b=new Book("Sideways");
		b.setAuthor("unknown");
		
		assertEquals("Sideways",b.title);
		assertEquals("unknown", b.author);
		
	}
	


	public void testGetPerson(){
			
			Book b2=new Book("Harry Potter");
			Person p2=new Person();
			p2.setName("Elvis");
			b2.setPerson(p2);
			String testName=b2.getPerson().getName(); //calls object p2, get name 
		assertEquals("Elvis",testName);
			
		}
	
public void testToString(){
	
	
	Book b3=new Book("The Great Expectations");
	
	Book b4=new Book("Strong");
	Person p3=new Person();
	p3.setName("John Smith");
	b3.setPerson(p3);
	
b3.setAuthor("Charles Dickens");


assertEquals("The Great Expectations by Charles Dickens;Not Available",b3.toString());
//assertEquals("Available",b4.toString());

}
}
	
