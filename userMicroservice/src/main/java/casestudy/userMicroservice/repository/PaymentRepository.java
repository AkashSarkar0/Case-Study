package casestudy.userMicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import casestudy.userMicroservice.models.PaymentDetails;

@Repository
public interface PaymentRepository extends MongoRepository<PaymentDetails, String> {

}
