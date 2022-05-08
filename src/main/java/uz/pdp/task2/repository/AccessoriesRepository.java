package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Accessories;
import uz.pdp.task2.entity.Computers;

@RepositoryRestResource(path = "accessories")
public interface AccessoriesRepository extends JpaRepository<Accessories,Integer> {
}
