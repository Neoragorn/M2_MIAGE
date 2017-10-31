
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Model.Author;
import Model.Book;
import interPackage.IAuthorRemote;
import interPackage.ILibrary;

public class Main {
	public static void main(String[] args) {
		try {
			InitialContext context = new InitialContext();
			IAuthorRemote author = (IAuthorRemote)context.lookup("interPackage.IAuthorRemote");
			Author aut = author.createAuthor("test3", "test33");
			System.out.println(author.sayHello() + aut.toString());
			ILibrary lib = (ILibrary)context.lookup("interPackage.ILibrary");
			Book livre = lib.creerLivre("la folle aventure", "what up doc");
			System.out.println(livre.toString());
			/*List<Book> lb = lib.allLivre();
			for (Book a : lb)
			{
				System.out.println(a.toString());
			}
			/*InitialContext context = new InitialContext();
			ILibrary lib = (ILibrary)context.lookup("interPackage.ILibrary");
			/*List<Book> bo = lib.allLivre();
			for (Book a : bo)
			{
				System.out.println(a.toString());
			}*/
			System.out.println("done");

		} catch (NamingException e) {

			e.printStackTrace();
		} 
	}
}