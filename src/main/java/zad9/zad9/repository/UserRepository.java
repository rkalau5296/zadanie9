package zad9.zad9.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zad9.zad9.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
