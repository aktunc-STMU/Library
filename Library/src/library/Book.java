package library;

public class Book {
	String author;
	String title;
	Person p;
	
	
	public Book(String title){
	
this.title=title;

	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author){
		this.author=author;

}
	
	
	public String getTitle(){
		return title;
		
	}
	
	public String getAuthor()
		
	{
		return author;
	}
	
	public void setPerson(Person p)
	{
		this.p=p;
		
	}

	public Person getPerson()
	{
		return p;
	}
	
	public String toString()
	{
		String availability;
		if ((getPerson()==null)){
			availability="Available";
				return title +" by "+author+";"+availability;
		}
		else
		{
			availability="Not Available";
		return title +" by "+author+";"+availability;
		//return title +" by "+author+";"+availability;
	}
	}
	}


