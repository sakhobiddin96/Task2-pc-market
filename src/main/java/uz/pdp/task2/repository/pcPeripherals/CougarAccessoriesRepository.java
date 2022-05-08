package uz.pdp.task2.repository.pcPeripherals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.pcPeripherals.CougarAccessories;
@RepositoryRestResource(path = "cougarAccessories")
public interface CougarAccessoriesRepository extends JpaRepository<CougarAccessories,Integer> {
}
