package library;

import junit.framework.TestCase;

import org.junit.Test;

public class PersonTest extends TestCase {

	@Test
	public void testPerson() {
		Person p=new Person();
		assertEquals("unknown",p.getName());
		assertEquals(3,p.getMaxBooks());
	}

	@Test
	public void testSetName() {
		Person n=new Person();
	n.setName("Tom");
	assertEquals("Tom",n.getName());
	
	}

	
	public void testSetMaxBooks() {
		Person p3=new Person();
		p3.setMaxBooks(10);
		assertEquals(10,p3.getMaxBooks());
	}

	public void testToString() {
		Person p4=new Person();
		
		p4.setName("Fred Flinstone");
		p4.setMaxBooks(6);
		assertEquals("Fred Flinstone",p4.getName());
		assertEquals(6,p4.getMaxBooks()); 
			
	
		
		
		
	}
}
