package interPackage;

import java.util.List;

import javax.ejb.Remote;

import Model.Author;

@Remote
public interface IAuthorRemote {

	public Author createAuthor(String firstname, String lastname);
	
	 public List<Author> allAuthors();

	String sayHello();
}
