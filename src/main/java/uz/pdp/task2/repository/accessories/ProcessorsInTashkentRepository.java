package uz.pdp.task2.repository.accessories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.accessories.PowerSupply;
import uz.pdp.task2.entity.accessories.ProcessorsInTashkent;

@RepositoryRestResource(path = "processorsInTashkent")
public interface ProcessorsInTashkentRepository extends JpaRepository<ProcessorsInTashkent,Integer> {
}
