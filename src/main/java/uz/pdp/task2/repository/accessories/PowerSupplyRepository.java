package uz.pdp.task2.repository.accessories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.accessories.MotherBoard;
import uz.pdp.task2.entity.accessories.PowerSupply;

@RepositoryRestResource(path = "powerSupply")
public interface PowerSupplyRepository extends JpaRepository<PowerSupply,Integer> {
}
