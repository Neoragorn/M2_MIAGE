package Model;

import java.io.Serializable;

public class Author implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String firstname;
	private String lastname;
	
	public Author()
	{
		
	}
	
	public Author(String firstname)  {
		super();
		this.firstname = firstname;
	}
	
	public Author(String firstname, String lastname)  {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
		
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String toString()
	{
		return this.firstname + " " + this.lastname;
	}
	
}
