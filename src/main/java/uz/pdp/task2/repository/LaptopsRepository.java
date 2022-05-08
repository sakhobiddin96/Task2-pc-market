package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Computers;
import uz.pdp.task2.entity.Laptops;

@RepositoryRestResource(path = "laptops")
public interface LaptopsRepository extends JpaRepository<Laptops,Integer> {
}
