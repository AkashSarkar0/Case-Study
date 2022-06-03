package casestudy.adminMicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import casestudy.adminMicroservice.model.Train;


@Repository
public interface TrainRepository extends MongoRepository<Train, Integer> {


}
