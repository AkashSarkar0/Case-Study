package casestudy.bookingMicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import casestudy.bookingMicroservice.model.User;


@Repository
public interface BookRepository extends MongoRepository<User, String>{

}
