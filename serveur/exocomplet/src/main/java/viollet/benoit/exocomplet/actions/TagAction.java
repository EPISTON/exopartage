package viollet.benoit.exocomplet.actions;

import java.util.Date;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import viollet.benoit.exocomplet.metier.Tag;

public class TagAction extends ActionSupport {
	
	private static Logger log = LogManager.getLogger(ActionSupport.class); 
	private static final long serialVersionUID = 1L;

	private Tag tag;
	private Set<Tag> tags;


	public String index() {
		log.info("appel de index!");
		return SUCCESS;
	}

}
