package Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    private String title;
    private String summary;
    private String description;
    
    private Author auteur;

    @Override
    public String toString() {
        return "Todo [summary=" + summary + ", description=" + description + " title=" + this.title + " author=" + this.auteur.getFirstname()
                + "]";
    }   

    public Book()
    {
    	
    }

	public Book(Long id, String title, String summary, String description, Author auteur) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.description = description;
		this.auteur = auteur;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAuteur() {
		return auteur;
	}

	public void setAuteur(Author auteur) {
		this.auteur = auteur;
	}
    
	
    
}