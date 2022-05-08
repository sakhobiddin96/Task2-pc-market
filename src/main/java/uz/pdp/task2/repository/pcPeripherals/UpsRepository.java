package uz.pdp.task2.repository.pcPeripherals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.pcPeripherals.Speakers;
import uz.pdp.task2.entity.pcPeripherals.Ups;

@RepositoryRestResource(path = "ups")
public interface UpsRepository extends JpaRepository<Ups,Integer> {
}
