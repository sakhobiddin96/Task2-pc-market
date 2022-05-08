package uz.pdp.task2.repository.pcPeripherals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.pcPeripherals.KeyboardsAndMouses;
import uz.pdp.task2.entity.pcPeripherals.MousePads;

@RepositoryRestResource(path = "mousePads")
public interface MousePadsRepository extends JpaRepository<MousePads,Integer> {
}
