package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Model.Author;
import interPackage.IAuthorRemote;

/**
 * Session Bean implementation class AuthorImpl
 */

@Stateless
@LocalBean
public class AuthorImpl implements IAuthorRemote {
	@PersistenceContext
	private EntityManager em;


	List<Author> listAuthor = new ArrayList<Author>();
    public AuthorImpl() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Author createAuthor(String firstname, String lastname) {
		Author auth = new Author(firstname, lastname);
		listAuthor.add(auth);
		//em.persist(auth);
		return auth;
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
