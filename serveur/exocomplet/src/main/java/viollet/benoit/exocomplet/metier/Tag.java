package viollet.benoit.exocomplet.metier;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	int id;
	String libele;
	Set<Photo> photos;
	
	@ManyToMany(mappedBy="tags")
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
	public String getLibele() {
		return libele;
	}
	public void setLibele(String libele) {
		this.libele = libele;
	}
	public Tag(int id, String libele) {
		super();
		this.id = id;
		this.libele = libele;
	}
	
	public Tag(){
		this(0,"");
	}
}
