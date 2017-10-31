package Bean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import Model.Author;
import interPackage.IAuthorRemote;

/**
 * Session Bean implementation class AuthorImpl
 */

@Stateless
@LocalBean
public class AuthorImpl implements IAuthorRemote {

    /**
     * Default constructor. 
     */
    public AuthorImpl() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Author createAuthor(String firstname, String lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Author> allAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello";
	}

}
