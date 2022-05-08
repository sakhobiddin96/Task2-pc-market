package uz.pdp.task2.repository.accessories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.accessories.HardDisc;
import uz.pdp.task2.entity.accessories.MotherBoard;

@RepositoryRestResource(path = "motherBoard")
public interface MotherBoardRepository extends JpaRepository<MotherBoard,Integer> {
}
