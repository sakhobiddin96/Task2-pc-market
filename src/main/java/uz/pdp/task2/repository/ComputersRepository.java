package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Computers;

@RepositoryRestResource(path = "computers")
public interface ComputersRepository extends JpaRepository<Computers,Integer> {
}
