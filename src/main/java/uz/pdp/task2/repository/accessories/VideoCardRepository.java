package uz.pdp.task2.repository.accessories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.accessories.Ssd;
import uz.pdp.task2.entity.accessories.VideoCard;

@RepositoryRestResource(path = "videoCard")
public interface VideoCardRepository extends JpaRepository<VideoCard,Integer> {
}
