package viollet.benoit.exocomplet.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import viollet.benoit.exocomplet.metier.Tag;

public interface TagRepository extends PagingAndSortingRepository<Tag, Integer>{
	
}
