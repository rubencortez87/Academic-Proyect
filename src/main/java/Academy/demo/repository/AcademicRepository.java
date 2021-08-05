package Academy.demo.repository;

import org.springframework.stereotype.Repository;

import Academy.demo.entity.Academic;

import org.springframework.data.repository.CrudRepository;
@Repository
public interface AcademicRepository extends CrudRepository<Academic, Long> {

}
