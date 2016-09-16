package viollet.benoit.exocomplet.metier;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Gallerie {
	int id;
	String titre;
	Date dateCreation;
	Set<Photo> photos;
	
	
	@OneToMany(mappedBy="gallerie")
	public Set<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(Set<Photo> photos) {
		this.photos = photos;
	}
	@Id @GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	public Gallerie(int id, String titre, Date dateCreation) {
		super();
		this.id = id;
		this.titre = titre;
		this.dateCreation = dateCreation;
	}
	
	public Gallerie(){
		this(0,"",new Date());
	}
}
