package uz.pdp.task2.repository.pcPeripherals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.pcPeripherals.FlashDrives;
import uz.pdp.task2.entity.pcPeripherals.Headphones;

@RepositoryRestResource(path = "headphones")
public interface HeadphonesRepository extends JpaRepository<Headphones,Integer> {
}
