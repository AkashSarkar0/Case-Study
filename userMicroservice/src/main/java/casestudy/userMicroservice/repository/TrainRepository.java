package casestudy.userMicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import casestudy.userMicroservice.models.Train;


@Repository
public interface TrainRepository extends MongoRepository<Train, Integer> {


}
