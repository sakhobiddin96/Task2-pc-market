package uz.pdp.task2.repository.pcPeripherals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.pcPeripherals.Ups;
import uz.pdp.task2.entity.pcPeripherals.UsbHdd;

@RepositoryRestResource(path = "usbHdd")
public interface UsbHddRepository extends JpaRepository<UsbHdd,Integer> {
}
