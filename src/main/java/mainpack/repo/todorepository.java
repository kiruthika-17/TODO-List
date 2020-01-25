package mainpack.repo;

import org.springframework.data.repository.CrudRepository;



import mainpack.model.todomodelclass;

public interface todorepository extends CrudRepository<todomodelclass,Integer> {

}
