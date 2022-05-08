package uz.pdp.task2.repository.accessories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.accessories.Ram;
import uz.pdp.task2.entity.accessories.Ssd;

@RepositoryRestResource(path = "ssd")
public interface SsdRepository extends JpaRepository<Ssd,Integer> {
}
