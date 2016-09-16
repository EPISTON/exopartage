package viollet.benoit.exocomplet.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import viollet.benoit.exocomplet.metier.Photo;

public interface PhotoRepository extends PagingAndSortingRepository<Photo, Integer> {

}
