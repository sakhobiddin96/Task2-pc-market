package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Laptops;
import uz.pdp.task2.entity.Monitors;

@RepositoryRestResource(path = "monitors")
public interface MonitorsRepository extends JpaRepository<Monitors,Integer> {
}
