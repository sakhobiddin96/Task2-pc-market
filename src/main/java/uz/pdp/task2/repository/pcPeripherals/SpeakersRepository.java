package uz.pdp.task2.repository.pcPeripherals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.pcPeripherals.PcCase;
import uz.pdp.task2.entity.pcPeripherals.Speakers;

@RepositoryRestResource(path = "speakers")
public interface SpeakersRepository extends JpaRepository<Speakers,Integer> {
}
