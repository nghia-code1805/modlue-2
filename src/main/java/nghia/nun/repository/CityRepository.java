package nghia.nun.repository;

import nghia.nun.model.city;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<city,Long> {

}
