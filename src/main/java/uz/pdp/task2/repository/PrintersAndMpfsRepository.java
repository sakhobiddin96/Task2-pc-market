package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Monitors;
import uz.pdp.task2.entity.PrintersAndMpfs;

@RepositoryRestResource(path = "printersAndMpfs")
public interface PrintersAndMpfsRepository extends JpaRepository<PrintersAndMpfs,Integer> {
}
