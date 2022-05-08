package uz.pdp.task2.repository.accessories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.accessories.CoolingSystems;
import uz.pdp.task2.entity.accessories.HardDisc;

@RepositoryRestResource(path = "hardDist")
public interface HardDiscRepository extends JpaRepository<HardDisc,Integer> {
}
