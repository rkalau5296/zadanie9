package zad9.zad9.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zad9.zad9.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


}
