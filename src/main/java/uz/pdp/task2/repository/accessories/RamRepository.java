package uz.pdp.task2.repository.accessories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.accessories.ProcessorsInTashkent;
import uz.pdp.task2.entity.accessories.Ram;

@RepositoryRestResource(path = "ram")
public interface RamRepository extends JpaRepository<Ram,Integer> {
}
