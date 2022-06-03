package casestudy.userMicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import casestudy.userMicroservice.models.UserLogin;

@Repository
public interface UserLoginRepository extends MongoRepository<UserLogin, String> {

}
