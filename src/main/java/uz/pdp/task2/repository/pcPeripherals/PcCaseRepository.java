package uz.pdp.task2.repository.pcPeripherals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.pcPeripherals.NetworkFilters;
import uz.pdp.task2.entity.pcPeripherals.PcCase;

@RepositoryRestResource(path = "pcCase")
public interface PcCaseRepository extends JpaRepository<PcCase,Integer> {
}
