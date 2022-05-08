package uz.pdp.task2.repository.pcPeripherals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.pcPeripherals.CougarAccessories;
import uz.pdp.task2.entity.pcPeripherals.FlashDrives;

@RepositoryRestResource(path = "flashDrives")
public interface FlashDrivesRepository extends JpaRepository<FlashDrives,Integer> {
}
