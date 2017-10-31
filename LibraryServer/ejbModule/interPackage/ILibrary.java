package interPackage;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;

import Model.Book;

@Remote
public interface ILibrary {
	public Book creerLivre(String titre, String nomAuteur);

	public void detruireLivre(Book l);

	public void updateLivre(Book livre, String newTitle);

	public List<Book> allLivre();

	public ArrayList<Book> searchLivreByTitle(String titre);

	public ArrayList<Book> searchLivreByAutor(String titre);

}
