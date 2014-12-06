package library;

import java.util.ArrayList;

public class MyLibrary {

	String name;
	ArrayList<Book> books; 
	ArrayList<Person> people;
	
	
	public MyLibrary(String Name)
	{
		this.name = name;
		ArrayList<Book> books=new ArrayList<Book>();
		ArrayList<Person> people=new ArrayList<Person>();
	}
	

public String getName()
{
	return name;
}
	
	public ArrayList<Book> getBook(){
		return books;
		
	}
	public ArrayList<Person> getPerson(){
		return people;
	
}
	
	public void addBook(Book b)
	{
		books.add(b);
	}
	
	public void addPerson(Person p)
	{
		people.add(p);
	}
	
	public void removeBook(Book b)
	{
		books.remove(b);
	}
	
	public boolean checkout(Book b,Person p)
	{
		if (b.getPerson()==null){
		 b.setPerson(p); 
		 return true;
			
		}
		else 
		return false;
		
		
	}
	
	public boolean checkin(Book b,Person p)
	{
		
		if (b.getPerson()!=null){
			 b.setPerson(null); 
			 return true;
				
			}
			else 
			return false;
			
}
	public int getCountofBooks(Person p){
		int numberofbooks=0;
		
		for(p.checkout());  
		
		return numberofbooks;
	}
	
	public ArrayList<Book> getAvailableBooks(){
	
		if(b.getPerson()==null)
		books.add(b.getTitle());
		return books;
	}
	
	//public arrayList<books> getAvailableBook()
}