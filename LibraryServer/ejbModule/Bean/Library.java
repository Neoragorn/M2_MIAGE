package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Model.Author;
import Model.Book;
import interPackage.ILibrary;

@Stateless
@LocalBean
public class Library implements ILibrary {

	@PersistenceContext
	private EntityManager em;
	
	private List<Book> library = new ArrayList<Book>();

	public Library()
	{
	}

	public Book creerLivre(String titre, String nomAuteur)
	{
		Book l = new Book();
		l.setAuteur(new Author(nomAuteur));
		l.setSummary("Minimum pour la création de la bibliotheque");
		l.setDescription("minimum also");
		l.setTitle(titre);
		//em.persist(l);
		this.library.add(l);
		return l;    	
	}

	public void detruireLivre(Book l)
	{
		Book ltmp = null;
		for (Book lb : this.library)
		{
			if (lb.equals(l))
				ltmp = lb;
		}
		this.library.remove(ltmp);
	}

	public void updateLivre(Book livre, String newTitle)
	{
		Book ltmp = null;
		for (Book lb : this.library)
		{
			if (lb.equals(lb))
				ltmp = lb;
		}
		ltmp.setTitle(newTitle);
	}

	public List<Book> allLivre()
	{
		Query q = em.createQuery("select t from Book t");

		@SuppressWarnings("unchecked")
		List<Book> list = q.getResultList();
		return list;

	}

	public ArrayList<Book> searchLivreByTitle(String titre)
	{
		ArrayList<Book> list = new ArrayList<Book>();

		for (Book lb : this.library)
		{
			if (lb.getTitle().equals(titre))
				list.add(lb);
		}
		return list;
	}

	public ArrayList<Book> searchLivreByAutor(String titre)
	{
		ArrayList<Book> list = new ArrayList<Book>();

		for (Book lb : this.library)
		{
			if (lb.getTitle().equals(titre))
				list.add(lb);
		}
		return list;
	}

}
